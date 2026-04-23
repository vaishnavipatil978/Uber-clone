package com.vaishnavi.uberapp.strategies;

import com.vaishnavi.uberapp.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}
