package com.sinensia.alumnos.presentation.appsController;

import com.sinensia.alumnos.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppAlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/coles/alumnos")
    public ModelAndView getListaAlumnos(){
        ModelAndView mav =new ModelAndView("alumnos");
        mav.addObject("alumnos",alumnoRepository.findAll());
        return mav;
    }

}
