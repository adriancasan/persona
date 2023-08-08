
package com.persona.persona.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter

public class Persona {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String nombre;
   private String apellido;
   private int dni; 

    public Persona(int id, String nombre, String apellido, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona() {
    }
   
   
   
   
}
