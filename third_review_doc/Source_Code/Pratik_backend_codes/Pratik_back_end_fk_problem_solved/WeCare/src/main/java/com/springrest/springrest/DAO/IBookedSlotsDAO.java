package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.BookedSlots;
@Repository
public interface IBookedSlotsDAO extends JpaRepository<BookedSlots, Long> {

}
