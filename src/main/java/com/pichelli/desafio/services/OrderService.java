package com.pichelli.desafio.services;

import com.pichelli.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private Double total;

    public Double total(Order order) {
        //Calcula o valor com desconto;
         total = order.getBasic() - discountValue(order);

        //Soma o valor do frete, ao valor já aplicado ao desconto;
        total += ShippingService.shipment(order);

        return total;
    }

    /*Não sei se posso perguntar por aqui, mas não seria mais interessante ao invés de passar
      o pedido inteiro para o shipping service, passar já o valor com o desconto calculado,
      evitando de precisar repetir o codigo de aplicação do desconto, e de precisar passar o objeto
      inteiro?
    * */

    private double discountValue(Order order){
        return order.getBasic() * order.getDiscount() / 100.00;
    }
}
