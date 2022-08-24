package com.cenfotec.biblioteca.repositories;

import com.cenfotec.biblioteca.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
