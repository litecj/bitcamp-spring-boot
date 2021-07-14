package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;

import java.util.List;

// barking, fetching, wagging tail
public interface DogService {
    //컬렉션 생성
    void add(DogDTO dog);
    int count();
    List<?> show();
    // 요구사항
    String barking(String bark);
    String fetching(String target);
    String waggingTail();



}
