package Gestionescolar;

public class Materia extends Alumno {

    private String nombreMateria;
    private float Calificacion;
    private float promedio;

    public Materia() {
        nombreMateria = "";
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public float getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(float Calificacion) {
        this.Calificacion = Calificacion;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

}
