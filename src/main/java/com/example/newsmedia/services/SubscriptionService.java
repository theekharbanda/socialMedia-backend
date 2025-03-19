package com.example.newsmedia.services;

import com.example.newsmedia.daos.SubscriptionDao;
import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.jpaRepos.SubscriptionRepo;
import com.example.newsmedia.modals.Subscription;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SubscriptionService implements SubscriptionDao {

    private final SubscriptionRepo subscriptionRepo;

    public SubscriptionService(SubscriptionRepo subscriptionRepo) {
        this.subscriptionRepo = subscriptionRepo;
    }
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepo.save(subscription);
    }
    public void deleteSubscription(UUID id) {
        subscriptionRepo.deleteById(id);
    }
    public Subscription fetchSubscriptionById(UUID id) throws ResourceNotFoundException {
        return subscriptionRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Subscription not found"));
    }
    
}
