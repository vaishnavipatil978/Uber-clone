package com.vaishnavi.uberapp.services;

import com.vaishnavi.uberapp.entities.Driver;
import com.vaishnavi.uberapp.entities.Ride;
import com.vaishnavi.uberapp.entities.RideRequest;
import com.vaishnavi.uberapp.entities.Rider;
import com.vaishnavi.uberapp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}
