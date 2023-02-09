package com.poc.kafkapoc.controller;

import com.poc.kafkapoc.kafka.JsonKafkaProducer;
import com.poc.kafkapoc.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafkaJson")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return  ResponseEntity.ok("Json Message sent");

     }
}
