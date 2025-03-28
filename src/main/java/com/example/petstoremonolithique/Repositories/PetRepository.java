package com.example.petstoremonolithique.Repositories;



import com.example.petstoremonolithique.Entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepository extends JpaRepository<Pet,Long> {
    @Query("SELECT p FROM Pet p WHERE p.status = ?1")
    List<Pet> findByStatus(String status);
}
