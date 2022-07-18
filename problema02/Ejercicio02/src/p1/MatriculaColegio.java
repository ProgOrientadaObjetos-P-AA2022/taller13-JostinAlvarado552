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
public class MatriculaColegio extends Matricula{
    private double matricula;
    
    public void establecerMatricula(){
        // tarifa = costo deportes + costo folletos + 
        //          costo uniformes + costo laboratorios
        matricula = 150.2 + 140.2 + 240.2 + 300.4;
    }
        
    public double obtenerMatricula(){
        return matricula;
    }
}
