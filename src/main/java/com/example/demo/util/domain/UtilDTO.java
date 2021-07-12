package com.example.demo.util.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
public class UtilDTO {
      private LocalDate today;
      private LocalTime currentTime;
      private LocalDateTime now;



}
