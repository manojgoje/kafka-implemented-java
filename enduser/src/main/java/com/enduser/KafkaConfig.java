package com.enduser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import com.enduser.AppConstaents.*;

@Configuration
public class KafkaConfig {

 private Logger logger = LoggerFactory.getLogger(KafkaConfig.class);

    @KafkaListener (topics = AppConstaents.LOCATION_UPDATE_TOPIC,groupId = AppConstaents.GROUP_ID)
    public void UpdatedLoation(String value)
    {
        System.out.println(value);
//        logger.info(value);
    }
}
