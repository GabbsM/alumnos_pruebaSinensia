package com.sinensia.alumnos.presentation.restController;


import com.sinensia.alumnos.modelo.Alumno;
import com.sinensia.alumnos.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/alumnos")
    public List<Alumno> getAll(){
        return alumnoRepository.findAll();
    }

}
