package com.cenfotec.biblioteca.services;

import com.cenfotec.biblioteca.domain.Libro;
import com.cenfotec.biblioteca.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroService {

    @Autowired
    LibroRepository  libroRepo;

    public List<Libro> getAllLibro(int count) {
        return this.libroRepo.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public Optional<Libro> getLibro(int id) {
        return this.libroRepo.findById(id);
    }

    public Libro createLibro(String nombre, String autor, String estado) {
        Libro libro = new Libro();
        libro.setNombre(nombre);
        libro.setAutor(autor);
        libro.setEstado(estado);
        return this.libroRepo.save(libro);
    }

    public void updateLibro(Libro libroToUpdate) {
        this.libroRepo.save(libroToUpdate);
    }

}
