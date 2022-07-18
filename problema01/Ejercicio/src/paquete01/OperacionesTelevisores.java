/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author DET PC
 */
public class OperacionesTelevisores {

    private double mayor = 0;
    private double s = 0;
    String cadenaMarcas = "";
    ArrayList<Televisor> televisores;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void totalPrecioTvs() {

        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
        }
    }

    public double obtenerPrecioTotalTvs() {
        return s;
    }

    public void establecertelevisorMasCaro() {

        for (int i = 0; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > mayor) {
                mayor = (televisores.get(i).obtenerPrecio());
            }
        }
    }

    public double obtenerTelevisorMasCaro() {
        return mayor;
    }

    public void establecerlistaMarcasVendidas() {

        for (int i = 0; i < televisores.size(); i++) {
            cadenaMarcas = String.format("%s%s\n", cadenaMarcas, televisores.get(i).obtenerMarca());
        }
    }

    public String obtenerListaMarcas() {
        return cadenaMarcas;
    }

}
