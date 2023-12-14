/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadisticasdecurso;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EstadisticasDeCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese el numero de estudiantes: ");
        int canEst = leer.nextInt();
        Curso cursoA = new Curso(nombre, canEst);

        
        
        Estudiante[] listaEst = new Estudiante[canEst];
        for (int i = 0; i < canEst; i++) {
            System.out.println("Ingrese informacion para el estudiante " + (i + 1));
            System.out.print("Nota: ");
            double nota = leer.nextDouble();

            System.out.print("Semestre: ");
            int semestre = leer.nextInt();

            listaEst[i] = new Estudiante(nota, semestre);
        }

        
        cursoA.cargarEstudiantes(listaEst);
        cursoA.calcularEstadistica();

        
        double[] datos = cursoA.mostrarDatos();
        System.out.println("\nEstadisticas del curso:");
        System.out.println("Nota Promedio: " + datos[0]);
        System.out.println("Ganadores: " + datos[1]);
        System.out.println("Perdedores: " + datos[2]);
        System.out.println("Semestre promedio: " + datos[3]);
    }

}
