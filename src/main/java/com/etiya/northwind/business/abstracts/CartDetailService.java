package com.etiya.northwind.business.abstracts;

import com.etiya.northwind.business.requests.cartDetails.CreateCartDetailRequest;
import com.etiya.northwind.business.requests.cartDetails.DeleteCartDetailRequest;
import com.etiya.northwind.business.requests.cartDetails.UpdateCartDetailRequest;
import com.etiya.northwind.business.requests.carts.CreateCartRequest;
import com.etiya.northwind.business.requests.carts.DeleteCartRequest;
import com.etiya.northwind.business.requests.carts.UpdateCartRequest;
import com.etiya.northwind.business.responses.cartDetails.CartDetailListResponse;
import com.etiya.northwind.business.responses.cartDetails.ReadCartDetailResponse;
import com.etiya.northwind.business.responses.carts.CartListResponse;
import com.etiya.northwind.business.responses.carts.ReadCartResponse;
import com.etiya.northwind.core.utilities.results.DataResult;
import com.etiya.northwind.core.utilities.results.Result;

import java.util.List;

public interface CartDetailService {
    DataResult<List<CartDetailListResponse>> getAll();
    Result add(CreateCartDetailRequest createCartDetailRequest);
    Result update(UpdateCartDetailRequest updateCartDetailRequest);
    Result delete(DeleteCartDetailRequest deleteCartDetailRequest);
    DataResult<ReadCartDetailResponse> getById(int id);
}
