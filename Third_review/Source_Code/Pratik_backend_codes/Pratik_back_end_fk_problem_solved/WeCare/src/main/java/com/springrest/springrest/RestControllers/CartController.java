package com.springrest.springrest.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Service.CartImpl;
import com.springrest.springrest.entities.Cart;

@RestController
public class CartController {

	
	@Autowired
	CartImpl cart;
	
	@GetMapping("/cart/{id}")
	public Cart getCart(@PathVariable String id)
	{
		return cart.getCart(Long.parseLong(id));
		
	}
	
	@GetMapping("/cart/allcarts")
	public List<Cart> getAllCarts()
	{
		return cart.getAllCarts();
	}
	
	
	@PostMapping("/add_cart")
	public Cart addcart(@RequestBody Cart c )
	{
		return cart.addCart(c);
	}
	

	
	
}
