package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.BookedSlots;


@Repository
public interface IBookedSlotsDAO extends JpaRepository<BookedSlots, Long> {

}
