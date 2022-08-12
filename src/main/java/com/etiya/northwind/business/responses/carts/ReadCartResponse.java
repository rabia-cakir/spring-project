package com.etiya.northwind.business.responses.carts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReadCartResponse {
    private int cartId;


    private int quantity;


    private double unitPrice;


    private String companyName;
}
