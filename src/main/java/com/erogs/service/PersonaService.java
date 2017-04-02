package com.erogs.service;

import com.erogs.domain.Persona;

import java.util.List;

/**
 * Created by Erick Gonzales on 2/04/2017
 */
public interface PersonaService {

    List<Persona>  getAll();
    Persona get(Long id);
}
