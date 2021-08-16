
package Gestionescolar;


public class Direccion {
    private String Lote;
    private String colonia;
    private String Municipio;
    private String Mz;
    private String Estado;

    public Direccion(String Lote, String colonia, String Municipio, String Mz, String Estado) {
        this.Lote = Lote;
        this.colonia = colonia;
        this.Municipio = Municipio;
        this.Mz = Mz;
        this.Estado = Estado;
    }

    public String getLote() {
        return Lote;
    }

    public void setLote(String Lote) {
        this.Lote = Lote;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getMz() {
        return Mz;
    }

    public void setMz(String Mz) {
        this.Mz = Mz;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

       
    
}
