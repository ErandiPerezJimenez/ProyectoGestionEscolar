package Gestionescolar;

import javax.swing.JOptionPane;
public class CRUD_Alumnos{
    
    public static void main(String[] args) {
    ArrayAlumnos obj=new ArrayAlumnos();
    ArrayMateria materia=new ArrayMateria();
        byte opcion ;
        do {
            opcion=Byte.parseByte(JOptionPane.showInputDialog(
                    "Menu Principal\n"
                    +"1.Agregar Alumno\n"
                    +"2.Mostrar lista de alumnos\n"   
                    +"3.Limpiar la lista\n"          
                    +"4.Eliminar Alumno\n"
                    +"5.Registrar materia\n"
                    +"6.Ver materias imscritas\n"        
                    +"7.Dar de baja materia\n"
                    +"8.Ver calificaciones por materia\n"
                    +"9.Numero de inscripcion\n"
                    +"10. Salir"));
            
            switch (opcion) {
                case 1:
                    obj.addAlumno();
                    
                    break;
                case 2:
                    obj.getAlumnos();
                    break;
                case 3:
                    obj.clearListaAlumnos();
                    break;
                case 4:
                    break;
                case 5:
                    materia.addMateria();
                    break;
                case 6:
                    materia.getMateria();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;    
                case 10:
                    JOptionPane.showMessageDialog(null,"Termino el programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                    break;
            }

        } while (opcion != 9);

    } 
    
    
}
