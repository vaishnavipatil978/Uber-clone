package com.vaishnavi.uberapp.services;

import com.vaishnavi.uberapp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
