package com.cenfotec.biblioteca.services;

import com.cenfotec.biblioteca.domain.Hijo;
import com.cenfotec.biblioteca.repositories.HijoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HijoServiceImpl implements HijoService{

    @Autowired
    HijoRepository  hijoRepo;

    @Override
    public Optional<Hijo> save(Hijo hijo) {
        return Optional.of(hijoRepo.save(hijo));
    }



}
