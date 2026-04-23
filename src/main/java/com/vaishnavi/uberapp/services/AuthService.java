package com.vaishnavi.uberapp.services;

import com.vaishnavi.uberapp.dto.DriverDto;
import com.vaishnavi.uberapp.dto.SignupDto;
import com.vaishnavi.uberapp.dto.UserDto;

public interface AuthService {

    String[] login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId, String vehicleId);

    String refreshToken(String refreshToken);
}
