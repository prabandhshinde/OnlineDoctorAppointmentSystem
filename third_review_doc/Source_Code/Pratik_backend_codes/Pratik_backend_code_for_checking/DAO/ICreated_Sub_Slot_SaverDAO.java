package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Created_Sub_Slot_Saver;

@Repository
public interface ICreated_Sub_Slot_SaverDAO extends JpaRepository<Created_Sub_Slot_Saver, Long>{

	
}
