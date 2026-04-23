package com.vaishnavi.uberapp.strategies.impl;

import com.vaishnavi.uberapp.entities.Driver;
import com.vaishnavi.uberapp.entities.RideRequest;
import com.vaishnavi.uberapp.repositories.DriverRepository;
import com.vaishnavi.uberapp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional()
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickupLocation());
    }
}
