package com.example.newsmedia.jpaRepos;

import com.example.newsmedia.modals.Subscription;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Primary
@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription, UUID> {
}
