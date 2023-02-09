package com.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
 // private   String topicName;

    @Bean
    public NewTopic topic(){
       // String topicName;
        return TopicBuilder.name("WikiMediaRectangle")
                .build();
    }
}
