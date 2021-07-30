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
public class Direccion {
    
    private int lote;
    private int manzana;
    private String colonia;
    private String municipio;
    private String estado;

    public Direccion() {
    }

    public Direccion(int lote, int manzana, String colonia, String municipio, String estado) {
        this.lote = lote;
        this.manzana = manzana;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Direccion{" + "lote=" + lote + ", manzana=" + manzana + ", colonia=" + colonia + ", municipio=" + municipio + ", estado=" + estado + '}';
    }
    
    
    
}
