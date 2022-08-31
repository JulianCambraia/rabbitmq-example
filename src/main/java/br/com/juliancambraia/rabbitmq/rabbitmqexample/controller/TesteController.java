package br.com.juliancambraia.rabbitmq.rabbitmqexample.controller;

import br.com.juliancambraia.rabbitmq.rabbitmqexample.config.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queues")
public class TesteController {

    @Autowired
    QueueSender sender;

    @GetMapping
    public String send() {
        sender.send("Enviando mensagem simples");
        return "ok. done";
    }
}
