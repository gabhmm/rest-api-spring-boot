package br.edu.atitus.api_example.dtos;

import java.time.LocalTime;

public record PointDTO(String name, double latitude, double longitude, String description, LocalTime openHour, LocalTime closeHour) {

}
