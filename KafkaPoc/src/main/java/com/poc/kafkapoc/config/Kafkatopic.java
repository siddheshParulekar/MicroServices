package com.poc.kafkapoc.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Kafkatopic {

    @Bean
    public NewTopic myTopics(){

        return TopicBuilder.name("kafkaDemo").build();
    }


    @Bean
    public NewTopic myJosnTopics(){

        return TopicBuilder.name("kafkaDemo_json").build();
    }
}
