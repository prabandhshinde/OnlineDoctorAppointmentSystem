package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.doctorScheduledSlots;

public interface IDoctorScheduledSlotsDAO extends JpaRepository<doctorScheduledSlots, Long> {

	
}
