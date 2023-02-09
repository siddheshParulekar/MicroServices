package com.ptown;

;
import com.ptown.entity.WikimediaData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class KafkaDatabaseConsumer {


    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    List<WikimediaData> messages = new ArrayList<>();

   // User userFromTopic = null;

    @GetMapping("/consumeStringMessage")
    public List<WikimediaData> consumeMsg() {
        return messages;
    }

//    @GetMapping("/consumeJsonMessage")
//    public User consumeJsonMessage() {
//        return userFromTopic;
//    }

//    @KafkaListener(groupId = "javatechie-1", topics = "javatechie", containerFactory = "kafkaListenerContainerFactory")
//    public List<String> getMsgFromTopic(String data) {
//        messages.add(data);
//        return messages;
//    }

//    @Autowired
//    private WikimediaDataRepo wikimediaDataRepo;
    @KafkaListener(
            topics = "testtopic",
            groupId ="testtopic-1",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public  void consume(String eventMessage ){

       // LOGGER.info(String.format("Event Message recived -> %s",eventMessage));

        WikimediaData data=new
                WikimediaData();
        data.setWikiEventData(eventMessage);
        messages.add(data);
      //  wikimediaDataRepo.save(data);

    }
}
