package com.cenfotec.biblioteca.repositories;

import com.cenfotec.biblioteca.domain.Padre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PadreRepository extends JpaRepository<Padre, Long> {
    List<Padre> findByNombreLikeIgnoreCase(String nombre);
}
