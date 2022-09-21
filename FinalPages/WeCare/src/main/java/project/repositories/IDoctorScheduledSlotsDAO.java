package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.doctorScheduledSlots;



@Repository
public interface IDoctorScheduledSlotsDAO extends JpaRepository<doctorScheduledSlots, Long> {

	
}
