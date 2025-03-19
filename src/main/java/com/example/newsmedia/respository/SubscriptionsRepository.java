//package com.example.newsmedia.respository;
//
//import com.example.newsmedia.modals.Subscription;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//
//@Repository
//public class SubscriptionsRepository implements NewsMediaRespositoryOperations {
//
//    Map<String, Subscription> subscriptions;
//    public SubscriptionsRepository() {
//        subscriptions = new HashMap<>();
//    }
//    public String addSubscription(Subscription subscription) {
//        subscriptions.put(subscription.getId(), subscription);
//        return "SUCCESS";
//    }
//    public Optional<Subscription> deleteSubscription(String id) {
//        return Optional.ofNullable(subscriptions.remove(id));
//    }
//    public Optional<Subscription> fetchSubscriptionById(String id) {
//        return Optional.ofNullable(subscriptions.get(id));
//    }
//
//}
