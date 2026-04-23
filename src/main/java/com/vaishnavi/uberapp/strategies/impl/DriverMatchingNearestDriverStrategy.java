package com.vaishnavi.uberapp.strategies.impl;

import com.vaishnavi.uberapp.entities.Driver;
import com.vaishnavi.uberapp.entities.RideRequest;
import com.vaishnavi.uberapp.repositories.DriverRepository;
import com.vaishnavi.uberapp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
