package com.poc.kafkapoc.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    public static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "kafkaDemo",groupId = "myGroup")
    public void consume(String message){
       LOGGER.info(String.format("Message recived %s",message));

    }
}
