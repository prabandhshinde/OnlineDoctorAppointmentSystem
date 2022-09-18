package com.springrest.springrest.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CartProducts {
	
	@Id
	 private long product_id;
	 private long mango_id;
	 private int qty;
	 
	 @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 @JoinColumn(name = "cart_id" , referencedColumnName = "cart_id")
	 private Cart cart;

	public CartProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartProducts(long product_id, long mango_id, int qty) {
		super();
		this.product_id = product_id;
		this.mango_id = mango_id;
		this.qty = qty;
	}

	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	public long getMango_id() {
		return mango_id;
	}

	public void setMango_id(long mango_id) {
		this.mango_id = mango_id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	 
	
	 
	 
}
