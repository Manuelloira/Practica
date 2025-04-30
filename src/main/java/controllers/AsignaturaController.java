package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import edu.loira.Practica.model.Asignatura;
import services.IAsignatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AsignaturaController {
@Autowired
private IAsignatura asignaturaService;

    @GetMapping("/asignaturas")
    public List<Asignatura> listartAsignaturas() {
        return listartAsignaturas();
    }
    }
    


