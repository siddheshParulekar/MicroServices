package com.poc.kafkapoc.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    public static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }

    public void sendMessage(String msg){

        LOGGER.info(String.format("Message sent %s",msg));
            kafkaTemplate.send("kafkaDemo",msg);
    }
}
