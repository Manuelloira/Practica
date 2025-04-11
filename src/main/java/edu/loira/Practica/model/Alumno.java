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
@Table(name = "alumnos")

public class Alumno {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_alumno;

@ManyToOne
    // Relación muchos a uno con la entidad Cliente
    // Se utiliza el atributo "mappedBy" para indicar que la relación es bidireccional
    @JoinColumn(name = "id_asignatura", referencedColumnName = "id_asignatura")
    // Se utiliza la anotación JoinColumn para especificar la columna de unión
    private Asignatura asignatura;
@Column(name = "nombre", nullable = false, length = 50)
private String nombre;
@Column(name = "apellidos", nullable = false, length = 50)
private String apellidos;
@Column(name = "dni", nullable = false, length = 9)
private String dni;
@Column(name = "email", nullable = false, length = 50)
private String email;
@Column(name = "telefono", nullable = false, length = 15)
private String telefono;
@Column(name = "direccion", nullable = false, length = 100)
private String direccion;
@Column(name = "fecha_nacimiento", nullable = false, length = 50)
private String fecha_nacimiento;



    public Alumno(String nombre, String apellidos, String dni, String email, String telefono, String direccion,
        String fecha_nacimiento) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.email = email;
    this.telefono = telefono;
    this.direccion = direccion;
    this.fecha_nacimiento = fecha_nacimiento;
}

public Long getId_alumno() {
    return id_alumno;
}
public void setId_alumno(Long id_alumno) {
    this.id_alumno = id_alumno;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellidos() {
    return apellidos;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}
public String getDni() {
    return dni;
}
public void setDni(String dni) {
    this.dni = dni;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getTelefono() {
    return telefono;
}
public void setTelefono(String telefono) {
    this.telefono = telefono;
}
public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public String getFecha_nacimiento() {
    return fecha_nacimiento;
}
public void setFecha_nacimiento(String fecha_nacimiento) {
    this.fecha_nacimiento = fecha_nacimiento;
}
@Override
public String toString() {
    return "Alumno [id_alumno=" + id_alumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
            + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + ", fecha_nacimiento="
            + fecha_nacimiento + "]";
}

}

