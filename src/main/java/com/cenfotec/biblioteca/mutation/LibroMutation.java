package com.cenfotec.biblioteca.mutation;

import com.cenfotec.biblioteca.domain.Libro;
import com.cenfotec.biblioteca.services.LibroService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class LibroMutation{
//public class LibroMutation implements GraphQLMutationResolver {
//
//    @Autowired
//    private LibroService libroService;
//
//    public Libro createVehicle(String nombre, String autor,
//                               String estado) {
//        return this.libroService.createLibro(nombre, autor, estado);
//    }
//
//    public Libro updateVehicle(Integer id, String nombre,
//                                 String autor,String estado) {
//        Optional<Libro> libro = libroService.getLibro(id);
//        if (libro.isPresent()){
//            Libro libroToUpdate = libro.get();
//            libroToUpdate.setNombre(nombre);
//            libroToUpdate.setNombre(autor);
//            libroToUpdate.setNombre(estado);
//
//            libroService.updateLibro(libroToUpdate);
//            return libroToUpdate;
//        } else {
//            return null;
//        }
//    }

}
