-- Database: "IngSoft"
-- Practica 1

-- DROP DATABASE "IngSoft";

CREATE DATABASE "IngSoft"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'C'
       LC_CTYPE = 'C'
       CONNECTION LIMIT = -1;

--Creo tabla para el Usuario con sus atributos
CREATE TABLE Usuario( 
  nidUsuario serial PRIMARY KEY,
  nombre VARCHAR(40) NOT NULL,
  correo VARCHAR(128) NOT NULL,
  contraseña VARCHAR(10) NOT NULL
);

--Creo tabla para el RegistroUsuario
CREATE TABLE RegistroUsuario(
  numeroDeSesiones INTEGER,
  nidUsuario serial REFERENCES Usuario(nidUsuario),
  idregistro serial PRIMARY KEY
 );

