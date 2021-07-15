package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.util.service.LambdaUtils;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class DogServiceImpl extends LambdaUtils implements DogService {

    private final DogDTO dog;
    private final ArrayList<DogDTO> dogs;

    public DogServiceImpl(){
        dog = new DogDTO();
        dogs = new ArrayList<>(); }

    @Override
    public void add(DogDTO dog) { dogs.add(dog);}

    @Override
    public int count() { return dogs.size();}

    @Override
    public List<?> show() {
        print.accept("등록된 Dog 수 : " + count() + '\n');
        //print.accept(string.apply(show()));
        return dogs; }

    @Override
    public String barking(String bark) { return dog.toString()+bark+"짖는다"; }

    @Override
    public String fetching(String target) { return dog.toString()+target+"을 물어온다";}

    @Override
    public String waggingTail() { return "꼬리를 흔든다"; }
}
