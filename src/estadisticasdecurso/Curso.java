/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadisticasdecurso;



/**
 *
 * @author labctr
 */
public class Curso {

    private String nombre;
    private int cantidadEst;
    private double notaProm;
    private int ganadores;
    private int perdedores;
    private double semestreProm;
    private Estudiante[] estudiantes;

    public Curso(String nombre, int cantidadEst) {
        this.nombre = nombre;
        this.cantidadEst = cantidadEst;
    }

    public double[] mostrarDatos() {
        double[] datos = new double[4];
        datos[0] = (double) this.notaProm;
        datos[1] = (double) this.ganadores;
        datos[2] = (double) this.perdedores;
        datos[3] = (double) this.semestreProm;
        return datos;
    }

    public void calcularEstadistica() {

        double totNot = 0;
        int totSem = 0;
        int gan = 0;
        int per = 0;
        
        for (Estudiante val : this.estudiantes) {
            totNot += val.getNota();
            totSem += val.getSemestre();
            if (val.getNota() < 14) {
                per += 1;

            } else {
                gan += 1;
            }
            
        }

        this.notaProm=totNot/this.cantidadEst;
        this.ganadores=gan;
        this.perdedores=per;
        this.semestreProm=totSem/this.cantidadEst;
        
    }

    public void cargarEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

}
