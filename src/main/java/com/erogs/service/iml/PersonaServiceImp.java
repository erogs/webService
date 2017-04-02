package com.erogs.service.iml;

import com.erogs.domain.Persona;
import com.erogs.service.PersonaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erick Gonzales on 2/04/2017
 */
@Service
public class PersonaServiceImp implements PersonaService {

    private List<Persona> personas = new ArrayList<Persona>();;

    public PersonaServiceImp() {
        Persona persona1 = new Persona();
        persona1.setId(1L);
        persona1.setName("Chica1");
        persona1.setLastName("Apellido1");
        Persona persona2 = new Persona();
        persona2.setId(2L);
        persona2.setName("Chica2");
        persona2.setLastName("Apellido2");
        Persona persona3 = new Persona();
        persona3.setId(1L);
        persona3.setName("Chica3");
        persona3.setLastName("Apellido3");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

    }

    public List<Persona> getAll() {
        return personas;
    }

    public Persona get(Long id) {

        for(Persona p : personas){
            if(p.getId().longValue() == id.longValue()){
                return p;
            }
        }
        return null;
    }
}
