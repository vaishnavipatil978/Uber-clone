package com.vaishnavi.uberapp.services;

import com.vaishnavi.uberapp.dto.DriverDto;
import com.vaishnavi.uberapp.dto.RideDto;
import com.vaishnavi.uberapp.dto.RideRequestDto;
import com.vaishnavi.uberapp.dto.RiderDto;
import com.vaishnavi.uberapp.entities.Rider;
import com.vaishnavi.uberapp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
