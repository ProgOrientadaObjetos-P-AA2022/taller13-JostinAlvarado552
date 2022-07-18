/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class DominioUTPL  implements Dominio{
    private String dominio;
    
    public void establecerDominio(){
        dominio = "@utpl.edu.ec";
    }
    
    public String obtenerDominio(){
        return dominio;
    }
}
