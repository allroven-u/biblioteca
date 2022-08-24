package com.cenfotec.biblioteca.services;

import com.cenfotec.biblioteca.domain.Padre;
import com.cenfotec.biblioteca.repositories.PadreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PadreServiceImpl implements PadreService {

    @Autowired
    PadreRepository padreRepo;

    @Override
    public List<Padre> getAll() {
        return padreRepo.findAll();
    }

    @Override
    public Optional<Padre> findById(long id) {
        return padreRepo.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public List<Padre> findByNombre(String nombre) {
        return padreRepo.findByNombreLikeIgnoreCase(nombre);
    }

    @Override
    public Optional<Padre> save(Padre padre) {
        return Optional.of(padreRepo.save(padre));
    }

    @Override
    public Optional<Padre> update(Padre padre) {
        Optional<Padre> record = padreRepo.findById(padre.getId());
        if (record.isPresent()) {
            Padre data = record.get();
            data.setNombre(padre.getNombre());
            data.setCedula(padre.getCedula());
            data.setDirección(padre.getDirección());
            data.setTeléfonoPrimario(padre.getTeléfonoPrimario());
            data.setTelefonoSecundario(padre.getTelefonoSecundario());
            return Optional.of(padreRepo.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        Optional<Padre> result = padreRepo.findById(id);
        if (result.isPresent()){
            padreRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
