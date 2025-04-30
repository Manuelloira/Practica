package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.loira.Practica.model.Asignatura;
import repository.AsignaturaRepository;

@Service
public class AsignaturaServiceImpl implements IAsignatura {


    @Override
    public List listarAsignaturas() {
return asignaturaRepository.findAll();
                
    }

    @Autowired
    private AsignaturaRepository asignaturaRepository;
    



}
