
package com.persona.persona.Service;

import com.persona.persona.Model.Persona;
import com.persona.persona.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository PersonaRepo;
    
    @Override
    public List<Persona> verPersona() {
       return PersonaRepo.findAll();
    }

    @Override
    public void agregarPersona(Persona pers) {
      PersonaRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
      PersonaRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
      return PersonaRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(Persona pers) {
      PersonaRepo.save(pers);
    }
    
}
