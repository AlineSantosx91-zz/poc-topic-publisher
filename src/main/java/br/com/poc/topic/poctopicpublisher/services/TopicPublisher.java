package br.com.poc.topic.poctopicpublisher.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Session;

@Service
public class TopicPublisher {

    private final Logger logger = LoggerFactory.getLogger(TopicPublisher.class);
    
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage() {
        logger.info("Sending message");
        jmsTemplate.send("topicoteste", (Session session) -> session.createTextMessage("Hello world!!!"));
    }
    
}
