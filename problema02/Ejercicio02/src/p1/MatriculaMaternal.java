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
public class MatriculaMaternal extends Matricula{
    private double tarifa;
    
        
    public void establecerMatricula(){
        // tarifa = costo desayunos + costo almuerzo + costo medico
        tarifa = 50.2 + 40.2 + 80.2;
    }
        
    public double obtenerMatricula(){
        return tarifa;
    }
     public String toString() {
        String cadena = "";
        cadena = String.format("Matricula Maternal %.2f",obtenerMatricula());

        return cadena;
    }
    
}