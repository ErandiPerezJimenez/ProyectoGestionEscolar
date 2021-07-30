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
public class CRUDAlumno {
    
    private int numinscri;

    public CRUDAlumno(int numinscri) {
        this.numinscri = numinscri;
    }

    public int getNuminscri() {
        return numinscri;
    }

    public void setNuminscri(int numinscri) {
        this.numinscri = numinscri;
    }

    @Override
    public String toString() {
        return "CRUDAlumno{" + "numinscri=" + numinscri + '}';
    }
    
    
    
}
