package com.cloudproject.subscriptionservice;

import com.cloudproject.subscriptionservice.entity.Subscription;
import com.cloudproject.subscriptionservice.repository.SubscriptionRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.sql.Date;
import org.springframework.stereotype.Component;

@Component
public class PopulateSubscription implements CommandLineRunner {
    @Autowired
    SubscriptionRepository subscriptionRepository;

    @Override
    public void run(String... args) throws Exception {
        Subscription sub = new Subscription();
        sub.setSubscriptionDate(new Date(System.currentTimeMillis()));
        sub.setSubscriptionId(UUID.randomUUID().toString());
        sub.setSubscriberName("jhon doe");
        sub.setReturnDate(new Date(System.currentTimeMillis()));
        sub.setBookId(1L);
        subscriptionRepository.save(sub);
    }
}
