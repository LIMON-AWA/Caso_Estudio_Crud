/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.Manejo_Empleados.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author luzam
 */
public class Utilidad {
    public static Date convertirFecha(String fecha){
    SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
    Date date=null;
    try{
    date=formato.parse(fecha);
    }catch(ParseException e){
    e.printStackTrace();
    }
        return date;
    }
}
