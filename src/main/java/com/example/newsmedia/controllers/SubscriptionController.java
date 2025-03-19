package com.example.newsmedia.controllers;


import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.modals.Subscription;
import com.example.newsmedia.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController("/subscriptions")
public class SubscriptionController {
    // Controller for subscription related operations
    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping("/subscriptions")
    public Subscription subscribe(@RequestBody Subscription subscription) {
        // Subscribe to a user
        return subscriptionService.addSubscription(subscription);
    }

    @GetMapping("/subscriptions/user/{id}")
    public Subscription fetchSubscriptions(@PathVariable String id) throws ResourceNotFoundException {
        // Fetch all subscriptions
        UUID userId = UUID.fromString(id);
        return subscriptionService.fetchSubscriptionById(userId);
    }
    @DeleteMapping("/subscriptions/{id}")
    public String unsubscribe(@PathVariable String id) throws ResourceNotFoundException {
        // Unsubscribe from a user
        UUID userId = UUID.fromString(id);
        subscriptionService.deleteSubscription(userId);
        return "SUCCESS";
    }
}
