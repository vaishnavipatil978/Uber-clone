package com.vaishnavi.uberapp.repositories;

import com.vaishnavi.uberapp.entities.Payment;
import com.vaishnavi.uberapp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}
