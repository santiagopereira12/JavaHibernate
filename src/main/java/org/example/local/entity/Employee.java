package org.example.local.entity;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "correo")
    private String correo;
    @Column (name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "password")
    private String password;

    public Employee() {
    }

    public Employee(int id, String correo, String nombre, String apellido, String password) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
