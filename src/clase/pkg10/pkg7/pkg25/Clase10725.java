package clase.pkg10.pkg7.pkg25;

import java.util.Scanner;

public class Clase10725 {
    
    public static Scanner escaner = Scanner(System.in);
    public static Persona[] personas = new Persona[5];

    
    public static void main(String[] args) {
        
        int opcion = 0;
        
        while(opcion != 5) {
            
            switch(opcion) {
            
                case 1:
                    cargarDatos();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                
            }
            
        }
        
    }
    
    public static void log(String mensaje) {
        System.out.println(mensaje);
    }
    
    public static void cargarDatos() {}
    
    public static void listarEstudiantes() {}
    
    public static void listarProfesores() {}
    
    public static void listarMaterias() {}
    
}

        /*
            - Persona con sus atributos: 
                DNI, 
                nombre, 
                apellido, 
                direccion, 
                telefono.
            - Profesor extends Persona {
                codigoProfesor;
                titulo;
            }
            - Estudiante extends Persona
                codigoEstudiante;
                especialidad;
        
            - Crear clase para relacionar a los profesores y a los estudiantes a traves de las materias
        
            - Materia
                public String nombre;
                public int codigoProfesor;
                public int codigoEstudiante;
                public float nota;
        
                - Luego de cargar todos los datos el progama debe permitir ver lo siguiente:
                    1. Listado de profesores
                    2. Listado de alumnos
                    3. Listado de materia segun profesor
        */  