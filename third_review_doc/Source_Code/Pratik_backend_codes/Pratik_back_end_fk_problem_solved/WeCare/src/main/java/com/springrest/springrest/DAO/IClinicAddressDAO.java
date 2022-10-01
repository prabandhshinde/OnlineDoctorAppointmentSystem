package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.ClinicAddress;


@Repository
public interface IClinicAddressDAO extends JpaRepository<ClinicAddress, Long>{

}
