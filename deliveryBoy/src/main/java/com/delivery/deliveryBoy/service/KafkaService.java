package com.delivery.deliveryBoy.service;


import com.delivery.deliveryBoy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLication(String location)
         {
            this.kafkaTemplate.send(AppConstants.LOCATION_UPDATE_NAME, location);
            this.logger.info("Location Produced");
             return true;

        }
}
