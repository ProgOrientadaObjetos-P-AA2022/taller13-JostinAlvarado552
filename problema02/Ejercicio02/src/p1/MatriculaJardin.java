/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p3.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaJardin extends Matricula {

    private double tarifa;

    public void establecerMatricula() {
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifa = 50.2 + 140.2 + 40;
    }

    public double obtenerMatricula() {
        return tarifa;
    }

    public String toString() {
        String cadena = "";
        cadena = String.format("Matricula Jardin: %.2f",obtenerMatricula());

        return cadena;
    }
}
