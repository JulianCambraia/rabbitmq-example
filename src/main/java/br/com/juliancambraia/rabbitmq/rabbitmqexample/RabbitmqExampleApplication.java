package br.com.juliancambraia.rabbitmq.rabbitmqexample;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit /* pode ser colocada em uma classe de configuração com um Bean*/
public class RabbitmqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqExampleApplication.class, args);
	}

}
