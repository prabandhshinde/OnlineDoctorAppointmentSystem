package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Booked_Slots;
@Repository
public interface IBooked_SlotsDAO extends JpaRepository<Booked_Slots, Long> {

}
