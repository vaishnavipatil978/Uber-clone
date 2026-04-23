package com.vaishnavi.uberapp.repositories;

import com.vaishnavi.uberapp.entities.Driver;
import com.vaishnavi.uberapp.entities.Rating;
import com.vaishnavi.uberapp.entities.Ride;
import com.vaishnavi.uberapp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
