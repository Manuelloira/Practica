package edu.loira.Practica.model;


import java.util.List;

import edu.loira.Practica.enumerated.Dificultad;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignaturas")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_asignatura;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Enumerated(EnumType.STRING)
    @Column(name = "dificultad", nullable = false, columnDefinition = "ENUM('BAJA', 'MEDIA', 'ALTA')")
    private Dificultad dificultad;

    @OneToMany(mappedBy = "asignatura", cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER) 
    // Relación uno a muchos con la entidad Factura
    private List<Expediente> lista_expediente;
 
    @ManyToMany(mappedBy = "asignaturas")
    private List<Profesor> profesores;
    public Asignatura(String nombre, Dificultad dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
    }
    public Asignatura() {
    }

    public Long getId_asignatura() {
        return id_asignatura;
    }
    public void setId_asignatura(Long id_asignatura) {
        this.id_asignatura = id_asignatura;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Dificultad getDificultad() {
        return dificultad;
    }
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }
    @Override
    public String toString() {
        return "Asignatura [id_asignatura=" + id_asignatura + ", nombre=" + nombre + ", dificultad=" + dificultad + "]";
    }

}
