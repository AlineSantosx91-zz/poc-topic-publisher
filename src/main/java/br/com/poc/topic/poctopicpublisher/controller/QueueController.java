package br.com.poc.topic.poctopicpublisher.controller;

import br.com.poc.topic.poctopicpublisher.services.TopicPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueController {

    @Autowired
    TopicPublisher topicPublisher;

    @GetMapping("/publicar_topico")
    public String publicarMensagem(){
        this.topicPublisher.sendMessage();
        return "ok";
    }
}
