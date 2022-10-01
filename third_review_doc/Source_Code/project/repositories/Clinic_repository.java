package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.Entity.Clinic_info;

public interface Clinic_repository extends JpaRepository<Clinic_info,Integer> {

}
