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
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String apellido, String ndss, double salario){
        super(nombre, apellido, ndss);
    }
public void establecerSalarioSemanal(double salario){
    if (salario >= 0.0)
        salarioSemanal = salario;
    else
        throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
}
public double obtenerSalarioSemanal(){
    return salarioSemanal;
} 
@Override
public double ingresos(){
    return obtenerSalarioSemanal();
}
@Override
public String toString(){
    return String.format("Empleado asalariado: %s\n%s: $%,.2f", super.toString(), "salario semanal", obtenerSalarioSemanal());
}
    
}
