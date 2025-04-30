package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.loira.Practica.model.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar profesores por nombre o apellido
    // List<Profesor> findByNombre(String nombre);
    // List<Profesor> findByApellido(String apellido);
    // List<Profesor> findByNombreAndApellido(String nombre, String apellido);

}
