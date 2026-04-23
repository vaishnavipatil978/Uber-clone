package com.vaishnavi.uberapp.services;

import com.vaishnavi.uberapp.dto.DriverDto;
import com.vaishnavi.uberapp.dto.RiderDto;
import com.vaishnavi.uberapp.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
