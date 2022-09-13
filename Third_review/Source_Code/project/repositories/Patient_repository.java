package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Patient_repository extends JpaRepository<project.Entity.Patient_info,Integer>  {

}
