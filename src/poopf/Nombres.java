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
public class Nombres {
    
    private String nombre1;
    private String nombre2;
    private String ap1;
    private String ap2;

    public Nombres() {
    }
    

    public Nombres(String nombre1, String nombre2, String ap1, String ap2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.ap1 = ap1;
        this.ap2 = ap2;
    }
    
    
    

    @Override
    public String toString() {
        return "Nombres{" + "nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", ap1=" + ap1 + ", ap2=" + ap2 + '}';
    }
    
    
    
}
