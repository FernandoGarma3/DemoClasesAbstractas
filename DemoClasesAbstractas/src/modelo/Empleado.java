/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author FernandoLuis
 */
public abstract class Empleado {
  private String primerNombre;
  private String apellidoPaterno;
  private String numeroDeSeguroSocial;
  
  
public Empleado( String nombre, String apellido, String ndss){
      primerNombre = nombre;
      apellidoPaterno = apellido;
      numeroDeSeguroSocial = ndss;
  }
public void establecerPrimerNombre(String nombre){
    primerNombre = nombre;
}   
public String obtenerPrimerNombre(){
    return primerNombre;
}
public void establecerApellidoPaterno(String apellido){
  apellidoPaterno = apellido;  
}
public String obtenerApellidoPaterno(){
    return apellidoPaterno;
}
public void establecerNumeroDeSeguroSocial(String ndss){
    numeroDeSeguroSocial = ndss;
}
public String obtenerNumeroDeSeguroSocial(){
    return numeroDeSeguroSocial;
}
@Override
public String toString(){
    return String.format("%s %s\nnumero de seguro social: %s", obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroDeSeguroSocial());
}
}
