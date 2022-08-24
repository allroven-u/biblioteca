package com.cenfotec.biblioteca.query;

import com.cenfotec.biblioteca.domain.Libro;
import com.cenfotec.biblioteca.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LibroQuery {

    @Autowired
    private LibroService libroService;

    public List<Libro> getLibros(int count) {
        return this.libroService.getAllLibro(count);
    }
    public Optional<Libro> getLibro(int id) {
        return this.libroService.getLibro(id);
    }

}
