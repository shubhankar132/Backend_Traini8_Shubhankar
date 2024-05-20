package com.restapi.springboot.controllers;

import com.restapi.springboot.entities.Trains;
import com.restapi.springboot.services.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController
{
    @Autowired
    private TrainingService trainingService;
    //create
    @PostMapping
    public ResponseEntity<Trains> createProduct(@RequestBody Trains trains)
    {
        Trains trains1 =this.trainingService.create(trains);
        return new ResponseEntity<>(trains, HttpStatus.CREATED);
    }

    @GetMapping ("")
    public ResponseEntity<List<Trains>> getAll()
    {
        List<Trains> all = this.trainingService.getAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
