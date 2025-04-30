package edu.loira.Practica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "expedientes")
public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_expediente;

    @ManyToOne
    @JoinColumn(name = "id_asignatura", referencedColumnName = "id_asignatura", nullable = false)
    private Asignatura asignatura;

    @ManyToOne
    @JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno", nullable = false)
    private Alumno alumno;

    @Column(name = "nota", nullable = false)
    private Double nota;

    @Column(name = "fecha_expediente", nullable = false, length = 50)
    private String fecha_expediente;

    // Getters y Setters
    public Long getId_expediente() {
        return id_expediente;
    }

    public void setId_expediente(Long id_expediente) {
        this.id_expediente = id_expediente;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getFecha_expediente() {
        return fecha_expediente;
    }

    public void setFecha_expediente(String fecha_expediente) {
        this.fecha_expediente = fecha_expediente;
    }

    @Override
    public String toString() {
        return "Expediente [id_expediente=" + id_expediente + ", asignatura=" + asignatura + ", alumno=" + alumno
                + ", nota=" + nota + ", fecha_expediente=" + fecha_expediente + "]";
    }
}
