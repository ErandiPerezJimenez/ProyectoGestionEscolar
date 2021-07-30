/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopf;

/**
 *
 * @author gerar
 */
public class Alumno {
    
    private String nombre;
    private String String;
    private int semestre;
    private int numCuenta;
    private int edad;

    public Alumno(String nombre, String String, int semestre, int numCuenta, int edad) {
        this.nombre = nombre;
        this.String = String;
        this.semestre = semestre;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getString() {
        return String;
    }

    public void setString(String String) {
        this.String = String;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", String=" + String + ", semestre=" + semestre + ", numCuenta=" + numCuenta + ", edad=" + edad + '}';
    }

 
    
    
}
