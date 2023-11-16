package com.example.login.repo;

import com.example.login.model.Route;
import com.example.login.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RouteRepo extends JpaRepository<Route, Long> {
    Optional<Route> findByName(String name);
}
