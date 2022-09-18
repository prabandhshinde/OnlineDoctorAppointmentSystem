package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.Cart;


public interface ICart {

	public List<Cart> getAllCarts();
	public Cart updateCart(Cart c);
	public Cart addCart(Cart c);
	public String deleteCart(long id);
	public Cart getCart(long id);
	
	
}
