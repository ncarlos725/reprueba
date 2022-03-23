/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticostucuman.servicios;


import electrodomesticostucuman.entidades.Electrodomestico;
import electrodomesticostucuman.entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Carlitox
 */
public class LavadoraServicios { 
    private Scanner pepe = new Scanner(System.in).useDelimiter("\n");
    private ElectrodomesticosServicios electrodomesticoServicio = new ElectrodomesticosServicios();
    
    public Lavadora CreaLavadora() {
        System.out.println("Creando una lavadora");
    Electrodomestico la  = electrodomesticoServicio.CreaElectrodomestico();
        System.out.println("Ingrese la carga");
        Integer carga =  pepe.nextInt();
        return new Lavadora(carga, la.getPrecio(), la.getColor(), la.getPeso(), la.getConsumoEnergetico());
    }
     
    public void precioFinal(Lavadora lavadora){
        electrodomesticoServicio.precioFinal(lavadora);
        lavadora.setPrecio(lavadora.getCarga() > 30 ? lavadora.getPrecio()+ 500d:lavadora.getPrecio()); // ? -> si  : -> sino es un ternario
    }
}
