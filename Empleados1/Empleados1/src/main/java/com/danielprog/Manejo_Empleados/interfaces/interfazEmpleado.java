/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.danielprog.Manejo_Empleados.interfaces;

import com.danielprog.Manejo_Empleados.modelo.Empleado;
import java.util.List;

/**
 *
 * @author luzam
 */
public interface interfazEmpleado {
    public List <Empleado> findAll();
   public Empleado listEmpleados(long id);
    public boolean agregar(Empleado empleado);
    public boolean actualizarEmpleado(Empleado empleado);
    public boolean eliminar(long id);
}
