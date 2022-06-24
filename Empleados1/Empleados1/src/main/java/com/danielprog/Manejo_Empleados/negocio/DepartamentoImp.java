package com.danielprog.Manejo_Empleados.negocio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.danielprog.Manejo_Empleados.data.Conexion;
import com.danielprog.Manejo_Empleados.interfaces.interfazDepartamento;
import com.danielprog.Manejo_Empleados.modelo.Departamento;

public class DepartamentoImp extends Conexion implements interfazDepartamento{
	   PreparedStatement pstDepartamentos;
	     ResultSet rsDepartamentos;
	     Departamento departamento = new Departamento();
	     String query="";
	     private List <Departamento> listDepartamento = new ArrayList<>();
	@Override
	public List<Departamento> findAll() {
		this.query="SELECT * FROM Departamentos";
		 
		try	{
			if(this.getConnection()!= null) 
			{
				System.out.println("El servidor se ha conectado a la base de datos");
				this.pstDepartamentos=this.getConnection().prepareStatement(query);
				this.rsDepartamentos=this.pstDepartamentos.executeQuery();
				while	(this.rsDepartamentos.next()) {
					Departamento departamento = new Departamento();
				       departamento.setId(this.rsDepartamentos.getLong("id"));
				       departamento.setDepartamento_codigo(this.rsDepartamentos.getString("departamento_codigo"));
				       departamento.setNombre_departamento(this.rsDepartamentos.getString("nombre_departamento"));
			            this.listDepartamento.add(departamento);
					
					
				}
			}
			else {
				
				System.out.println("Fallo la conexion");
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		return listDepartamento;
	}

	@Override
	public Departamento listDepartamento(long id) {
		this.query="SELECT * FROM Departamentos WHERE id=?";
		Departamento departamento = new Departamento();
		try {
			if(this.getConnection()!= null)  {
				System.out.println("El servidor se ha conectado a la base de datos");
				this.pstDepartamentos=this.getConnection().prepareStatement(query);
				  this.pstDepartamentos.setLong(1,id);
				this.rsDepartamentos=this.pstDepartamentos.executeQuery();
				rsDepartamentos=pstDepartamentos.executeQuery();
				while(this.rsDepartamentos.next()) {
				 departamento.setId(this.rsDepartamentos.getLong("id"));
			       departamento.setDepartamento_codigo(this.rsDepartamentos.getString("departamento_codigo"));
			       departamento.setNombre_departamento(this.rsDepartamentos.getString("nombre_departamento"));
				}
			}
			
			else{
				System.out.println("Fallo la conexion");
				
			}
			
		}catch(Exception e) 
		{
			e.printStackTrace();
				}
		
		return departamento;
	}

	@Override
	public boolean add(Departamento departamento) {
		this.query="INSERT INTO Departamentos(departamento_codigo,nombre_departamento) VALUES (?,?)";
		try {
			if(this.getConnection()!=null) {
				System.out.println("El servidor se ha conectado con la base de datos");
				this.pstDepartamentos=this.getConnection().prepareStatement(query);
				this.pstDepartamentos.setString(1,departamento.getDepartamento_codigo());
				this.pstDepartamentos.setString(2, departamento.getNombre_departamento());
				this.pstDepartamentos.executeUpdate();
				
				
			}
			
			else {
				System.out.println("Fallo la conexion");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean actualizarDepartamento(Departamento departamento) {
		this.query="UPDATE Departamentos SET id=?, departamento_codigo=?,nombre_departamento=? WHERE id=?";
		try {
			if(this.getConnection()!=null) {
				System.out.println("El servidor se ha conectado con la base de datos");
				this.pstDepartamentos=this.getConnection().prepareStatement(query);
				this.pstDepartamentos.setLong(1,departamento.getId());
				this.pstDepartamentos.setString(2, departamento.getDepartamento_codigo());
				this.pstDepartamentos.setString(3, departamento.getNombre_departamento());
				this.pstDepartamentos.setLong(4, departamento.getId());
				this.pstDepartamentos.executeUpdate();
				
				
			}
			
			else {
				System.out.println("Fallo la conexion");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean eliminar(long id) {
        this.query="DELETE FROM Departamentos WHERE id=?";
        try{
if (this.getConnection()!=null) {
     this.pstDepartamentos=this.getConnection().prepareStatement(query);
     this.pstDepartamentos.setLong(1, id);
     this.pstDepartamentos.executeUpdate();
} else {System.out.println("Fallo la conexion");}
    }catch(Exception e){}
    return false;
	}

	
	
}
