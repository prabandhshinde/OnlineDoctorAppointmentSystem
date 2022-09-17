package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.clinic_Address;


@Repository
public interface IClinic_AddressDAO extends JpaRepository<clinic_Address, Long>{

}
