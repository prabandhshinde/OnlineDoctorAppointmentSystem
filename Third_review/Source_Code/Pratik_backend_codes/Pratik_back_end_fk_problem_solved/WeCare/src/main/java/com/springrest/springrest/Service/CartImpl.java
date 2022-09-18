package com.springrest.springrest.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.CartDAO;
import com.springrest.springrest.entities.Cart;
import com.springrest.springrest.entities.CartProducts;

@Service
public class CartImpl implements ICart {

	@Autowired
	CartDAO dao;
	
	ArrayList<CartProducts> list =new ArrayList<>();
	
	CartProducts pro1 = new CartProducts();
	CartProducts pro2 = new CartProducts();
	
	@Override
	public List<Cart> getAllCarts() {
		
		return dao.findAll();
	}

	@Override
	public Cart getCart(long id) {
		return dao.getReferenceById(id);
		
	}

	@Override
	public Cart updateCart(Cart c) {
		return dao.save(c);
	}

	@Override
	public Cart addCart(Cart c) {
		
		pro1.setMango_id(10);
		pro1.setProduct_id(10);
		pro1.setQty(100);
		
		pro2.setMango_id(20);
		pro2.setProduct_id(20);
		pro2.setQty(200);
		
		list.add(pro1);
		list.add(pro2);
		
		c.setList(list);
		return dao.save(c);
	}

	@Override
	public String deleteCart(long id) {
		
		Cart cart = dao.getReferenceById(id);
		dao.delete(cart);
		return "cart deleted";
	}

}
