package com.example.login.service;

import com.example.login.dtos.StationDto;

import java.util.List;

public interface StationService {
    StationDto getStation(Long stationTd);
    List<StationDto> getStations();
    StationDto addStation(StationDto stationDto);
    void deleteStation(Long stationTd);
}