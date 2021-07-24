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
public class Materia {
    public char nombreMateria;
    public char seriacion;
    public int creditosDeMateria;

    public Materia() {
    }

    public Materia(char nombreMateria, char seriacion, int creditosDeMateria) {
        this.nombreMateria = nombreMateria;
        this.seriacion = seriacion;
        this.creditosDeMateria = creditosDeMateria;
    }

    public char getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(char nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public char getSeriacion() {
        return seriacion;
    }

    public void setSeriacion(char seriacion) {
        this.seriacion = seriacion;
    }

    public int getCreditosDeMateria() {
        return creditosDeMateria;
    }

    public void setCreditosDeMateria(int creditosDeMateria) {
        this.creditosDeMateria = creditosDeMateria;
    }
    
    //      public void contabilidadCreditos(){}
}
