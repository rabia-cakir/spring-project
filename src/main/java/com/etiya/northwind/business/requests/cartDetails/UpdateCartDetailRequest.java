package com.etiya.northwind.business.requests.cartDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCartDetailRequest {
    private int cartDetailId;
    private int cartId;
    private int productId;

}
