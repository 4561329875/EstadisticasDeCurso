/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadisticasdecurso;

/**
 *
 * @author labctr
 */
public class Estudiante {

    private double nota;
    private int semestre;

    public Estudiante(double nota, int semestre) {
        this.nota = nota;
        this.semestre = semestre;
    }

    public double getNota() {
        return nota;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
