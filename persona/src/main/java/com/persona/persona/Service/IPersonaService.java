
package com.persona.persona.Service;

import com.persona.persona.Model.Persona;
import java.util.List;


public interface IPersonaService {
  public List <Persona> verPersona ();
  public void agregarPersona (Persona pers);
  public void borrarPersona (Long id);
  public Persona buscarPersona (Long id);
  public void editarPersona (Persona pers);
}
