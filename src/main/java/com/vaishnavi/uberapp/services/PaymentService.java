package com.vaishnavi.uberapp.services;

import com.vaishnavi.uberapp.entities.Payment;
import com.vaishnavi.uberapp.entities.Ride;
import com.vaishnavi.uberapp.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
