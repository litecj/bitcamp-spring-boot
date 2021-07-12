package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface UtilService {
    public LocalDate today();
    LocalTime currentTime();
    LocalDateTime now();
    String tonow();

}
