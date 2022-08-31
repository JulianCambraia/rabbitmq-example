## Exemplo Básico de Producer e Consumer usando RabbitMQ

### Comando Docker para subir a última versão do RabbitMQ
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.10-management

### Cliente do RabbitMQ (http://localhost:15672)  

#### Nome da fila criada: fila-springboot
#### Nome da Exchange Criada: exchange-springboot
#### Nome da Routing key vinculada a fila (bind): rounting-springboot

