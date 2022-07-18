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
public class MatriculaCampamento extends Matricula{
    private double matricula;
    
    public void establecerMatricula(){
        // tarifa = costo transporte + costo comida + costo instructores
        matricula = 100.2 + 30.2 + 90.2;
    }
        
    public double obtenerMatricula(){
        return matricula;
    }
}
