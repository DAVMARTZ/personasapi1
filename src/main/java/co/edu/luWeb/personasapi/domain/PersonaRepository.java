/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.luWeb.personasapi.domain;

import java.util.List;

import org.springframework.data.repository.Repository;

/**
 *
 *
 *
 * @author nixod
 *
 */
public interface PersonaRepository extends Repository<Persona, Integer> {

    List<Persona> findAll();

    Persona findById(int id);

    Persona save(Persona p);

    void delete(Persona p);

}
