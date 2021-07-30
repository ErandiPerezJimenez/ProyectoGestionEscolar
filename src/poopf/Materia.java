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
public class Materia {
    
    private String nommat;
    private int creditos;

    public Materia(String nommat, int creditos) {
        this.nommat = nommat;
        this.creditos = creditos;
    }

    public void setNommat(String nommat) {
        this.nommat = nommat;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Materia{" + "nommat=" + nommat + ", creditos=" + creditos + '}';
    }
    
    
    
}
