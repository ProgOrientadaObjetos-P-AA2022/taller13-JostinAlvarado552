/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.OperacionesTelevisores;
import paquete01.Televisor;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Televisor t1 = new Televisor();
        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUMG-21 pulgadas");
        t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);

        OperacionesTelevisores oT1 = new OperacionesTelevisores();
        oT1.establecerTelevisores(tvs);
        oT1.totalPrecioTvs();
        oT1.establecertelevisorMasCaro();
        oT1.establecerlistaMarcasVendidas();
        System.out.println("-----------------");
        System.out.printf("%.2f\n", oT1.obtenerPrecioTotalTvs());
        System.out.println("-----------------");
        System.out.printf("%s\n", oT1.obtenerListaMarcas());
        System.out.println("-----------------");
        System.out.printf("Televisor mas caro: %s\n", oT1.obtenerTelevisorMasCaro());

    }
}
