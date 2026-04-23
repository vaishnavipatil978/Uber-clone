package com.vaishnavi.uberapp.strategies;

import com.vaishnavi.uberapp.entities.Driver;
import com.vaishnavi.uberapp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
