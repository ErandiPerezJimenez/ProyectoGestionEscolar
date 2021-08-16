
package Gestionescolar;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ArrayAlumnos {
    ArrayList<Alumno> listaAlumnos = new ArrayList();
    
    //para no escribir tanto JOptionPane.showInputDialog
    public String Input(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    
    public void addAlumno(){
         String nombre=Input("Nombre alumno:");
         String apellidoPaterno=Input("Apellido Ppaterno");
         String apellidoMaterno=Input("Apellido Materno");
         String carrera=Input("Carrera:");
         int numeroCuenta=Integer.parseInt(JOptionPane.showInputDialog("Numero de Cuenta:"));
      
         Alumno alumno= new Alumno();
         alumno.setNombre(nombre);
         alumno.setApellidoPaterno(apellidoPaterno);
         alumno.setApellidoMaterno(apellidoMaterno);
         alumno.setCarrera(carrera); 
         alumno.setNumeroCuenta(numeroCuenta);
         listaAlumnos.add(alumno);
         
    }
    public void getAlumnos(){
        String string="";
        for(int i=0;i<listaAlumnos.size();i++){
        string+="Alumno: "+(i+1)+"\n";
        string += "Nombre: "+listaAlumnos.get(i).getNombre()+"\n";
        string += "Apellido Paterno: "+listaAlumnos.get(i).getApellidoPaterno()+"\n";
        string += "Apellido Materno:"+listaAlumnos.get(i).getNombre()+"\n";
        string += "Numero de cuenta:"+listaAlumnos.get(i).getNumeroCuenta()+"\n";
       }
         JOptionPane.showMessageDialog(null,string);
    }
   
    public void clearListaAlumnos(){
        listaAlumnos.clear();
    } 

   
    
} 
