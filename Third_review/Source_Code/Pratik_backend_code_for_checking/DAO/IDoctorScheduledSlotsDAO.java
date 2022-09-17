package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.doctorScheduledSlots;

@Repository
public interface IDoctorScheduledSlotsDAO extends JpaRepository<doctorScheduledSlots, Long> {

	
}
