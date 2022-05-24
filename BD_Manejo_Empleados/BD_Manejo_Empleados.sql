create database Manejo_Empleados;
use Manejo_Empleados;

CREATE TABLE ciudades (
  id_ciudad int(11) NOT NULL,
  nombre varchar(50) DEFAULT NULL,
  PRIMARY KEY (id_ciudad)
);

CREATE TABLE departamento (
  id int(11) NOT NULL AUTO_INCREMENT,
  departamento_codigo int(11) DEFAULT NULL,
  departamentio_nombre varchar(20) DEFAULT NULL,
  fecha_hora_crea timestamp NULL DEFAULT NULL,
  fecha_hora_modifica timestamp NULL DEFAULT NULL,
  PRIMARY KEY (id),
  KEY ciudades_idciudad (ciudades_idciudad),
  CONSTRAINT departamento_ibfk_1 FOREIGN KEY (ciudades_idciudad) REFERENCES ciudades (idciudad)
);

CREATE TABLE empleados (
  id int(11) NOT NULL AUTO_INCREMENT,
  documento_tipo enum('RC','TI','CC','CE') DEFAULT NULL,
  documento_numero double DEFAULT NULL,
  nombres varchar(50) DEFAULT NULL,
  apellidos varchar(50) DEFAULT NULL,
  departamento_id int(11) DEFAULT NULL,
  direccion varchar(100) DEFAULT NULL,
  correo_electronico varchar(100) DEFAULT NULL,
  telefono double DEFAULT NULL,
  fecha_hora_crea timestamp NULL DEFAULT NULL,
  fecha_hora_modifica timestamp NULL DEFAULT NULL,
  ciudadid int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY ciudadid (ciudadid),
  CONSTRAINT empleados_ibfk_1 FOREIGN KEY (ciudadid) REFERENCES ciudades (idciudad)
);

alter table departamento add foreign key (ciudades_id_ciudad) references ciudades (id_ciudad);
drop database Manejo_Empleados;