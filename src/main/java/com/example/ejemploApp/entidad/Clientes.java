package com.example.ejemploApp.entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Entity //ANOTACION HACE REFERENCIA A UNA ENTIDAD PARA REGISTERAR EN MI BASE DE DATOS
@Table(name = "clientes")
public class Clientes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//PERMITE GENERAR SERIES DE NUMEROS PARA EL ID
    private Long id; //typeDate Long permite almacernar volumenes de datos
    @Column(name="nombres")//ANOTACIÓN PARA CREAR UNA COLUMNA EN LA BASE DE DATOS
    private String nombres;
    @Column(name="apellidos")//ANOTACIÓN PARA CREAR UNA COLUMNA EN LA BASE DE DATOS
    private String apellidos;
    @Column(name="email")//ANOTACIÓN PARA CREAR UNA COLUMNA EN LA BASE DE DATOS
    private String email;

    @Column(name="fecha_creacion")//ANOTACIÓN PARA CREAR UNA COLUMNA EN LA BASE DE DATOS
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @PrePersist//ACCION ANTES DE GUARDAR EN LA BASE DE DATOS
    public  void prePersist(){
        fechaCreacion = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
