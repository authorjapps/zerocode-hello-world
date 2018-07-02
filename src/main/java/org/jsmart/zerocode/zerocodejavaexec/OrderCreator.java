package org.jsmart.zerocode.zerocodejavaexec;

import org.jsmart.zerocode.zerocodejavaexec.pojo.Order;

public class OrderCreator {

    public Order createOrder(Order order){

        /**
         * TODO- Suppose you process the "order" received, and finally return the "orderProcessed".
         * Here it is hardcoded for simplicity and understanding purpose only
         */
        Order orderProcessed = new Order(1020301, order.getItemName(), order.getQuantity());

        return orderProcessed;
    }


}
