package com.pichelli.desafio.services;

import com.pichelli.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    private static Double orderValue;

    public static Double shipment(Order order) {
        orderValue = order.getBasic() - discountValue(order);
        Double shipmentValue;

        if (orderValue < 100.00){
            shipmentValue = 20.00;
        } else if (orderValue < 200.00) {
            shipmentValue = 12.00;
        }else {
            shipmentValue = 0.00;
        }

        return shipmentValue;
    }

    private static double discountValue(Order order){
        return order.getBasic() * order.getDiscount() / 100.00;
    }
}
