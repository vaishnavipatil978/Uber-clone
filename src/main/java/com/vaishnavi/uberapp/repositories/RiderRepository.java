package com.vaishnavi.uberapp.repositories;

import com.vaishnavi.uberapp.entities.Rider;
import com.vaishnavi.uberapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
    Optional<Rider> findByUser(User user);
}
