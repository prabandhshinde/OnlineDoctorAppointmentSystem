package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Cart;
import com.springrest.springrest.entities.CartProducts;

@Repository
public interface CartDAO extends JpaRepository<Cart, Long>{

}
