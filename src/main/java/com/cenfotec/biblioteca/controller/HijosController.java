package com.cenfotec.biblioteca.controller;

import com.cenfotec.biblioteca.domain.Hijo;
import com.cenfotec.biblioteca.domain.Padre;
import com.cenfotec.biblioteca.services.HijoService;
import com.cenfotec.biblioteca.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping({"/hijos"})
public class HijosController {

    @Autowired
    private PadreService padreService;
    @Autowired
    private HijoService hijoService;


    @PostMapping
    public Hijo create(@RequestBody Hijo hijo){
        Optional<Padre> result = padreService.findById(1);
        hijo.setPadre(result.get());
        return hijoService.save(hijo).get();
    }


}
