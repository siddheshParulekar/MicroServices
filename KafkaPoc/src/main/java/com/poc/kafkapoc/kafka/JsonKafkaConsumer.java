package com.poc.kafkapoc.kafka;

import com.poc.kafkapoc.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    public static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "kafkaDemo_json",groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Message recived %s",user));

    }

}

