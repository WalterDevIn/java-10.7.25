package clase.pkg10.pkg7.pkg25;

import java.util.Scanner;

public class Clase10725 {

    public static Scanner escaner = new Scanner(System.in);
    public static Persona[] personas = new Persona[100];
    public static Materia[] materias = new Materia[100];

    public static int cantidadPersonas = 0;
    public static int cantidadMaterias = 0;

    public static void main(String[] args) {
        int opcion = 0;

        log("\n".repeat(20));
        do {
            log("\n--- MENU ---\n1. Cargar datos (profesor/estudiante)\n2. Listar profesores\n3. Listar estudiantes\n4. Listar materias por profesor\n5. Salir\n\nopcion: ");
            opcion = escaner.nextInt();

            escaner.nextLine(); // limpiar buffer
            clear();

            switch (opcion) {
                case 1:
                    seleccionarCarga();
                    break;
                case 2:
                    listarProfesores();
                    break;
                case 3:
                    listarEstudiantes();
                    break;
                case 4:
                    listarMaterias();
                    break;
                case 5:
                    log("Saliendo del programa.");
                    break;
                default:
                    log("Opcion no válida.");
            }

            if(opcion > 1 && opcion < 5) {
                log("continar... "); 
                escaner.nextLine();
            }
            clear();

        } while (opcion != 5);
    }

    // MENU
    public static void seleccionarCarga() {
        boolean seguir = true;
        while (seguir) {
            log("\n--- CARGA DE DATOS ---\n1. profesor\n2. estudiante\n3. materia\n0. volver\n\nopcion: ");

            int opcion = escaner.nextInt();
            escaner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    cargarProfesor();
                    break;
                case 2:
                    cargarEstudiante();
                    break;
                case 3:
                    cargarMateria();
                    break;
                case 0:
                    seguir = false;
                    break;
                default:
                    log("opción no válida.\n");
            }

            clear();

        }

    }

    public static void listarProfesores() {
        log("\n--- LISTADO DE PROFESORES ---\n");
        for (Persona persona: personas) if (persona instanceof Profesor) log(((Profesor) persona).toString());
    }

    public static void listarEstudiantes() {
        log("\n--- LISTADO DE ESTUDIANTES ---\n");
        for (Persona persona: personas) if (persona instanceof Estudiante) log(((Estudiante) persona).toString());
    }

    public static void listarMaterias() {
        log("\n--- MATERIA ---\ncodigo del profesor: ");
        int codigo = escaner.nextInt();

        escaner.nextLine(); // limpiar buffer

        boolean encontrado = false;

        for (Materia materia : materias) {
            if (materia.codigoProfesor == codigo) {
                log("materia: " + materia.nombre + "\nestudiante: " + findStudentName(materia.codigoEstudiante) + "\nnota: " + materia.nota + "\n");
                encontrado = true;
            }
        }

        if (!encontrado) log("No se encontraron materias para ese profesor.\n");
    }

    // MENU CARGA
    public static void cargarProfesor() {
        clear();
        log("--- CARGA DE PROFESOR ---\n");

        Profesor profesor = new Profesor();

        log("dni: ");
        int dni = escaner.nextInt(); escaner.nextLine();
        log("nombre: ");
        String nombre = escaner.nextLine();
        log("apellido: ");
        String apellido = escaner.nextLine();
        log("direccion: ");
        String direccion = escaner.nextLine();
        log("telefono: ");
        int telefono = escaner.nextInt(); escaner.nextLine();
        log("codigo profesor: ");
        int codigo = escaner.nextInt(); escaner.nextLine();
        log("titulo: ");
        String titulo = escaner.nextLine();

        profesor.set(dni, nombre, apellido, direccion, telefono, codigo, titulo);
        personas[cantidadPersonas++] = profesor;

        log("\nprofesor cargado.\n");
    }
    
    public static void cargarEstudiante() {
        clear();
        log("--- CARGA DE ESTUDIANTE ---\n");

        Estudiante estudiante = new Estudiante();
        
        log("dni: ");
        int dni = escaner.nextInt(); escaner.nextLine();
        log("nombre: ");
        String nombre = escaner.nextLine();
        log("apellido: ");
        String apellido = escaner.nextLine();
        log("direccion: ");
        String direccion = escaner.nextLine();
        log("telefono: ");
        int telefono = escaner.nextInt(); escaner.nextLine();
        log("codigo estudiante: ");
        int codigoEstudiante = escaner.nextInt(); escaner.nextLine();
        log("especialidad: ");
        String especialidad = escaner.nextLine();

        estudiante.set(dni, nombre, apellido, direccion, telefono, codigoEstudiante, especialidad);
        personas[cantidadPersonas++] = estudiante;

        log("\nestudiante cargado.\n");
    }

    public static void cargarMateria() {
        clear();
        log("--- CARGA DE MATERIA ---\n");

        log("nombre: ");
        String nombreMateria = escaner.nextLine();
        log("codigo del profesor: ");
        int codigoProfesor = escaner.nextInt();
        log("codigo del estudiante: ");
        int codigoEstudiante = escaner.nextInt();
        log("nota: ");
        float nota = escaner.nextFloat(); escaner.nextLine();

        if (!checkTeacher(codigoProfesor)) {
            log("\nerror: codigo de profesor no valido.\nmateria no cargada.\ncontinuar... ");
            escaner.nextLine();
            return;
        }
        if (!checkStudent(codigoEstudiante)) {
            log("\nerror: codigo de estudiante no valido.\nmateria no cargada.\ncontinuar... ");
            escaner.nextLine();
            return;
        }

        Materia materia = new Materia();
        materia.set(nombreMateria, codigoProfesor, codigoEstudiante, nota);
        materias[cantidadMaterias++] = materia;

        log("materia cargada.\n");
    }

    // AUXILIAR
    public static void log(String mensaje) {
        System.out.print(mensaje);
    }

    public static void clear() {
        log("\n".repeat(40));
    }

    public static boolean checkTeacher(int codigoProfesor) {
        for (Persona persona: personas) if (persona instanceof Profesor && ((Profesor) persona).codigoProfesor == codigoProfesor) return true;
        return false;
    }

    public static boolean checkStudent(int codigoEstudiante) {
        for (Persona persona: personas) if (persona instanceof Estudiante && ((Estudiante) persona).codigoEstudiante == codigoEstudiante) return true;
        return false;
    }

    public static String findStudentName(int codigoEstudiante) {
        for (Persona persona : personas) if (persona instanceof Estudiante && ((Estudiante) persona).codigoEstudiante == codigoEstudiante) return persona.nombre + " " + persona.apellido;
        return "desconocido";
    }

}
