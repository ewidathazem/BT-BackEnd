package com.example.login.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StationDto {
    private Long id;
    private String name;
    private String city;
    private  double latitude;
    private double longitude;
}
