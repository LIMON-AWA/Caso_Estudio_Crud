/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.Manejo_Empleados.modelo;

import java.util.Date;

/**
 *
 * @author luzam
 */
public class Departamento {
    private long id;
    private String departamento_codigo;
    private String nombre_departamento;

    public Departamento() {
    }

    public Departamento(long id, String departamento_codigo, String nombre_departamento) {
        this.id = id;
        this.departamento_codigo = departamento_codigo;
        this.nombre_departamento = nombre_departamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartamento_codigo() {
        return departamento_codigo;
    }

    public void setDepartamento_codigo(String departamento_codigo) {
        this.departamento_codigo = departamento_codigo;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }
    
}