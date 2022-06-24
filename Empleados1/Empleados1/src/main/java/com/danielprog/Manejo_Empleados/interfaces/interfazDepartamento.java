package com.danielprog.Manejo_Empleados.interfaces;

import java.util.List;

import com.danielprog.Manejo_Empleados.modelo.Departamento;



public interface interfazDepartamento {
    public List <Departamento> findAll();
   public Departamento listDepartamento(long id);
    public boolean add(Departamento departamento);
    public boolean actualizarDepartamento(Departamento departamento);
    public boolean eliminar(long id);
}
