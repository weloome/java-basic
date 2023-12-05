package com.example.javabasic.com.helloshop.order;

import com.example.javabasic.com.helloshop.product.Product;
import com.example.javabasic.com.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
