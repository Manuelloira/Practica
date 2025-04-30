package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.loira.Practica.model.Expediente;

public interface ExpedienteRepository  extends JpaRepository<Expediente, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar expedientes por el ID del alumno
    List<Expediente> findByAlumnoId(Long alumnoId);

}
