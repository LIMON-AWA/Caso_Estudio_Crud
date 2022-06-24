/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.Manejo_Empleados.modelo;


/**
 *
 * @author luzam
 */
public class Empleado {
    private long id;
   private String tipo_documento;
   private long numero;
   private String nombres;
   private String apellidos;
   private long departamento_id;
   private String direccion;
   private String correo_electronico;
   private long telefono;

    public Empleado() {
    }

    public Empleado(long id, String tipo_documento, long numero, String nombres, String apellidos, long departamento_id, String direccion, String correo_electronico, long telefono) {
        this.id = id;
        this.tipo_documento = tipo_documento;
        this.numero = numero;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.departamento_id = departamento_id;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public long getnumero() {
        return numero;
    }

    public void setnumero(long numero) {
        this.numero = numero;
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

    public long getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(long departamento_id) {
        this.departamento_id = departamento_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

   
}
