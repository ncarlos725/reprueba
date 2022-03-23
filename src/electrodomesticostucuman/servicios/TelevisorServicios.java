 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticostucuman.servicios;

import electrodomesticostucuman.entidades.Electrodomestico;
import electrodomesticostucuman.entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Carlitox
 */
public class TelevisorServicios {
       private Scanner pepe = new Scanner(System.in).useDelimiter("\n");
    private ElectrodomesticosServicios electrodomesticoServicio = new ElectrodomesticosServicios();
    
    public Televisor CrearTelevisor() {
        System.out.println("Creando un televisor");
    Electrodomestico tv  = electrodomesticoServicio.CreaElectrodomestico();
        System.out.println("Ingrese pulgadas");
        Double pulgadas =  pepe.nextDouble();
        System.out.println("Ingrese si tiene sintonizadorTDT (si) o (no)");
        Boolean sintonizadorTDT =  pepe.next().equalsIgnoreCase("si");  
        return new Televisor(pulgadas, sintonizadorTDT, tv.getPrecio(), tv.getColor(), tv.getPeso(), tv.comprobarConsumoEnergeico());
    }//Fin Creartelevisor
    
    public void precioFinal(Televisor televisor){
    electrodomesticoServicio.precioFinal(televisor);
    televisor.setPrecio(televisor.getPulgadas() > 40 ? televisor.getPrecio() * 13 : televisor.getPrecio());
    televisor.setPrecio(televisor.getSintonizadorTDT() ? televisor.getPrecio() + 500d : televisor.getPrecio());
    }
}
