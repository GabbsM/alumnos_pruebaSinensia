package com.sinensia.alumnos.repository;

import com.sinensia.alumnos.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,String> {


}
