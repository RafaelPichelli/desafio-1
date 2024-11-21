package com.pichelli.desafio;

import com.pichelli.desafio.entities.Order;
import com.pichelli.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Order order = new Order(1034, 150.00, 20.00);
		// Order order = new Order(2282, 800.00, 10.00);
 		 Order order = new Order(1309, 95.90, 0.00);

		System.out.println("Pedido código: " + order.getCode() + "\n" +
				"Valor total: R$ " + orderService.total(order) );
	}
}
