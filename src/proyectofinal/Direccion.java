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
public class Direccion {
    public int lote;
    public char colonia;
    public char municipio;
    public int mz;
    public char estado;

    public Direccion() {
    }

    public Direccion(int lote, char colonia, char municipio, int mz, char estado) {
        this.lote = lote;
        this.colonia = colonia;
        this.municipio = municipio;
        this.mz = mz;
        this.estado = estado;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public char getColonia() {
        return colonia;
    }

    public void setColonia(char colonia) {
        this.colonia = colonia;
    }

    public char getMunicipio() {
        return municipio;
    }

    public void setMunicipio(char municipio) {
        this.municipio = municipio;
    }

    public int getMz() {
        return mz;
    }

    public void setMz(int mz) {
        this.mz = mz;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
     
}
