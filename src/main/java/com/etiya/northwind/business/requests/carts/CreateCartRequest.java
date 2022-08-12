package com.etiya.northwind.business.requests.carts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateCartRequest {

    private int cartId;
    private int quantity;
    private double unitPrice;
    private String customerId;
}
