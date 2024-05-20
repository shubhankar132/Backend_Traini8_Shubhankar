package com.restapi.springboot.services;
import com.restapi.springboot.entities.Trains;

import java.util.List;

public interface TrainingService {

    Trains create(Trains trains);
    List< Trains> getAll();

}
