package com.delivery.deliveryBoy.controller;


import com.delivery.deliveryBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLoation() {

            this.kafkaService.updateLication("(" + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + ")");


        return new ResponseEntity<>(Map.of("Message", "Location Updated Succesfully by javaProgram"), HttpStatus.OK);
    }

}
