package com.cenfotec.biblioteca.services;

import com.cenfotec.biblioteca.domain.Padre;

import com.cenfotec.biblioteca.repositories.PadreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PadreService {

    public List<Padre> getAll();
    public Optional<Padre> findById(long id);
    public List<Padre> findByNombre(String nombre);
    public  Optional<Padre> save(Padre contact);
    public  Optional<Padre> update(Padre contact);
    public boolean delete(Long id);

}
