package com.restapi.springboot.repositories;

import com.restapi.springboot.entities.Trains;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Trains, Long>{



}
