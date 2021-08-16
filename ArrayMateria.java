
package Gestionescolar;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ArrayMateria {
     ArrayList<Materia> listaMaterias = new ArrayList();
    
    //para no escribir tanto JOptionPane.showInputDialog
    public String Input(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    
    public void addMateria(){
        String nombreMateria=Input("Materia:");
        int calificacion=Integer.parseInt(JOptionPane.showInputDialog("Calificacion:"));
        Materia materia=new Materia();
        materia.setNombreMateria(nombreMateria);
        materia.setCalificacion(calificacion);
        listaMaterias.add(materia);
    }
    
    public void getMateria(){
        String string="";
        for(int i=0;i<listaMaterias.size();i++){
        string+="Alumno: "+(i+1)+"\n";
        string += "Materia: "+listaMaterias.get(i).getNombreMateria()+"\n";
        string += "Calificacion:"+listaMaterias.get(i).getCalificacion()+"\n";
       }
         JOptionPane.showMessageDialog(null,string);
    }
    public void materiaAprovada(){
        
               
        
    }
}
