package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.loira.Practica.model.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar asignaturas por nombre o código
    // List<Asignatura> findByNombre(String nombre);
    // List<Asignatura> findByCodigo(String codigo);
    // List<Asignatura> findByNombreAndCodigo(String nombre, String codigo);

}
