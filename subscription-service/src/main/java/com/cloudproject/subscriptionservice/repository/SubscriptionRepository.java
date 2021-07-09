package com.cloudproject.subscriptionservice.repository;

import com.cloudproject.subscriptionservice.entity.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription,String> {

}
