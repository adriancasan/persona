
package com.persona.persona.Controller;

import com.persona.persona.Model.Persona;
import com.persona.persona.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class PersonaController {
    
    
    @Autowired 
    private IPersonaService PersonaServ;
    
    @PostMapping ("/persona")
    public void agregarPersona(@RequestBody Persona pers) {
        PersonaServ.agregarPersona(pers);
    }
    
    @GetMapping ("/persona")
    @ResponseBody
    public List <Persona> verPersona() {
        return PersonaServ.verPersona();
    }
    
    @DeleteMapping ("/persona/{id}")
    public void borrarPersona (@PathVariable Long id) {
        PersonaServ.borrarPersona(id);
    }
    
    @PutMapping ("/persona/{id}") 
    
    public void editarPersona (@RequestBody Persona pers) {
        PersonaServ.editarPersona(pers);
    }
    
    
 
}
