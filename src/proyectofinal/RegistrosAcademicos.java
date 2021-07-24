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
public class RegistrosAcademicos {
    private int generacion;
    private char materiasCursadas;
    private float calificacion;
    private float promedio;

    public RegistrosAcademicos() {
    }

    public RegistrosAcademicos(int generacion, char materiasCursadas, float calificacion, float promedio) {
        this.generacion = generacion;
        this.materiasCursadas = materiasCursadas;
        this.calificacion = calificacion;
        this.promedio = promedio;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public char getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(char materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
   // public void generarHistorialAcademico(){}
}
