package com.erogs.controller;

import com.erogs.domain.Persona;
import com.erogs.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Erick Gonzales on 2/04/2017
 */
@Controller
public class PersonaController {

    @Autowired
    private PersonaService service;

    @RequestMapping(value = "/personas", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody
    List<Persona> getAll(){
        return service.getAll();
    }

    @RequestMapping(value = "/personas/{id}" , method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody Persona get(@PathVariable ("id") Long id){
        return service.get(id);
    }
}
