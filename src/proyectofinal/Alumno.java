/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Optiplex 780
 */
public class Alumno {
    public int semestre;
    public int numCuenta;
    public int edad;
    public char carrera;
    public char datosAlumno;

    public Alumno() {
    }

    public Alumno(int semestre, int numCuenta, int edad, char carrera, char datosAlumno) {
        this.semestre = semestre;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.carrera = carrera;
        this.datosAlumno = datosAlumno;
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

    public char getCarrera() {
        return carrera;
    }

    public void setCarrera(char carrera) {
        this.carrera = carrera;
    }

    public char getDatosAlumno() {
        return datosAlumno;
    }

    public void setDatosAlumno(char datosAlumno) {
        this.datosAlumno = datosAlumno;
    }

    
    
    
}
