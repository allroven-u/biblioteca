package com.cenfotec.biblioteca.controller;

import com.cenfotec.biblioteca.domain.Hijo;
import com.cenfotec.biblioteca.domain.Padre;
import com.cenfotec.biblioteca.services.HijoService;
import com.cenfotec.biblioteca.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/padres"})
public class PadresController {

    @Autowired
    private PadreService padreService;

    @GetMapping
    public List getAll(){
        return padreService.getAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Padre> findById(@PathVariable long id){
        Optional<Padre> result = padreService.findById(id);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/padres/filterbyName")
    public  ResponseEntity<List<Padre>> getPadresByName(@RequestParam String nombre){
        return new ResponseEntity<List<Padre>>(padreService.findByNombre("%"+nombre+"%"), HttpStatus.OK);
    }

    @PostMapping
    public Padre create(@RequestBody Padre padre){
        return padreService.save(padre).get();
    }


    @PutMapping(value="/{id}")
    public ResponseEntity<Padre> update(@PathVariable("id") long id,
                                          @RequestBody Padre padre){
        padre.setId(id);
        Optional<Padre> result = padreService.update(padre);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (padreService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
