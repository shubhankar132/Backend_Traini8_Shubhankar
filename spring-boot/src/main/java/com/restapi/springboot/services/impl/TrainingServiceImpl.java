package com.restapi.springboot.services.impl;

import com.restapi.springboot.entities.Trains;
import com.restapi.springboot.repositories.TrainingRepository;
import com.restapi.springboot.services.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TrainingServiceImpl implements TrainingService{

    private TrainingRepository trainingRepository;
    @Autowired
    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    @Override
    public Trains create(Trains trains) {
        return this.trainingRepository.save(trains);
    }

    @Override
    public List<Trains> getAll()
    {
        List<Trains> all= this.trainingRepository.findAll();
        return all;
    }
}
