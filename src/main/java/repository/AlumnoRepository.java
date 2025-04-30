package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.loira.Practica.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar alumnos por nombre o apellido
    // List<Alumno> findByNombre(String nombre);
    // List<Alumno> findByApellido(String apellido);
    // List<Alumno> findByNombreAndApellido(String nombre, String apellido);

}
