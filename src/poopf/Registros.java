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
public class Registros {
        
    private int generacion;
    private String matapro;
    private float calificacion;
    private float promedio; 

    public Registros(int generacion, String matapro, float calificacion, float promedio) {
        this.generacion = generacion;
        this.matapro = matapro;
        this.calificacion = calificacion;
        this.promedio = promedio;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
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

    
    
    @Override
    public String toString() {
        return "Registros{" + "generacion=" + generacion + ", matapro=" + matapro + ", calificacion=" + calificacion + ", promedio=" + promedio + '}';
    }
    
    
}
