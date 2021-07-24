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
public class Nombres {
    public char nombreUno;
    public char nombreDos;
    public char apUno;
    public char apDos;

    public Nombres() {
    }

    public Nombres(char nombreUno, char nombreDos, char apUno, char apDos) {
        this.nombreUno = nombreUno;
        this.nombreDos = nombreDos;
        this.apUno = apUno;
        this.apDos = apDos;
    }

    public char getNombreUno() {
        return nombreUno;
    }

    public void setNombreUno(char nombreUno) {
        this.nombreUno = nombreUno;
    }

    public char getNombreDos() {
        return nombreDos;
    }

    public void setNombreDos(char nombreDos) {
        this.nombreDos = nombreDos;
    }

    public char getApUno() {
        return apUno;
    }

    public void setApUno(char apUno) {
        this.apUno = apUno;
    }

    public char getApDos() {
        return apDos;
    }

    public void setApDos(char apDos) {
        this.apDos = apDos;
    }
    
    
   // public void copiarNombres(){}
}
