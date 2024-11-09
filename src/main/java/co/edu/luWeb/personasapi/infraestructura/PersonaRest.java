/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.luWeb.personasapi.infraestructura;

import co.edu.luWeb.personasapi.domain.Persona;
import co.edu.luWeb.personasapi.domain.PersonaService;
import co.edu.luWeb.personasapi.domain.TipoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author nixod
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/personasrest"})
public class PersonaRest {

    @Autowired
    PersonaService service;

    @Autowired
    TipoPersonaService tpservice;

    @GetMapping("/submit")
    public List<Persona> listar() {
        return service.listar();
    }

    @PostMapping("/submit")
    public Persona agregar(@RequestBody Persona p) {
        return service.add(p);
    }

    @GetMapping("/submit/{id}")
    public Persona listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping("/submit/{id}")
    public Persona editar(@RequestBody Persona p, @PathVariable("id") int id) {
        p.setId(id);
        return service.edit(p);
    }
}
