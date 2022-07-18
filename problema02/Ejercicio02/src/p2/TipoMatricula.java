/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p3.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> t) {
        matriculas = t;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerMatricula();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();

    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public String toString() {

        String cadena = "Lista de Matriculas\n";
        for (int i = 0; i < matriculas.size(); i++) {
            cadena = String.format("%s%s\n", cadena, matriculas.get(i));
        }
        cadena = String.format("%sPromedio de Matriculas: %s\n", cadena, obtenerPromedioMatriculas());
        return cadena;
    }

}
