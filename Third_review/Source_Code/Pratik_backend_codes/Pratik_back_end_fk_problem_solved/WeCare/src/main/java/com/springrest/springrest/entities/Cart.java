package com.springrest.springrest.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	
	@Id
	private long cart_id;
	private long orderNo;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<CartProducts> list;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(long cart_id, long orderNo) {
		super();
		this.cart_id = cart_id;
		this.orderNo = orderNo;
	}

	public long getCart_id() {
		return cart_id;
	}

	public void setCart_id(long cart_id) {
		this.cart_id = cart_id;
	}

	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	public List<CartProducts> getList() {
		return list;
	}

	public void setList(List<CartProducts> list) {
		this.list = list;
	}
	
}
