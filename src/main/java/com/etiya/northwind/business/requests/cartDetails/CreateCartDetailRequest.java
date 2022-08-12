package com.etiya.northwind.business.requests.cartDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCartDetailRequest {

    private int cartDetailId;
    private int cartId;
    private int productId;

}
