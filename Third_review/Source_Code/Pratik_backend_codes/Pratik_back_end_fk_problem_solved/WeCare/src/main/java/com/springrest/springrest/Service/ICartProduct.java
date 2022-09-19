package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.CartProducts;

public interface ICartProduct {

	public List<CartProducts> getAllCarts();
	public CartProducts updateCart(CartProducts c);
	public CartProducts addCart(CartProducts c);
	public String deleteCart(long id);
	public CartProducts getCart(long id);
	
}
