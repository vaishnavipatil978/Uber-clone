package com.vaishnavi.uberapp.strategies;

import com.vaishnavi.uberapp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);

}
