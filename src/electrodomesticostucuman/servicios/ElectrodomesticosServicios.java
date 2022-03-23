package electrodomesticostucuman.servicios;

import electrodomesticostucuman.entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Carlitox
 */
public class ElectrodomesticosServicios {

    private Scanner pepe = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico CreaElectrodomestico() {
        System.out.println("Ingrese peso");
        Integer peso = pepe.nextInt();
        System.out.println("Ingrese color");
        String color = pepe.next();
        System.out.println("Ingrese consumo energetico");
        char letra = pepe.next().charAt(0);
        return new Electrodomestico(1000d, color, peso, letra);
    }//Fin CrearElectrodomesticos

    public void precioFinal(Electrodomestico electrodomestico) {
        switch (electrodomestico.getConsumoEnergetico()) {
            case 'A':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 10000d);
                break;
            case 'B':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 800d);
                break;
            case 'C':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 600d);
                break;
            case 'D':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 500d);
                break;
            case 'E':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 300d);
                break;
            case 'F':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 100d);
                break;
        }//Swicht PRECIO
        
        if (electrodomestico.getPeso() >= 1 &&  electrodomestico.getPeso() <= 19) {
            electrodomestico.setPrecio(electrodomestico.getPrecio()+100d);
        }else if (electrodomestico.getPeso() <= 49) {
             electrodomestico.setPrecio(electrodomestico.getPrecio()+500d);
        }else if (electrodomestico.getPeso() <= 79) {
             electrodomestico.setPrecio(electrodomestico.getPrecio()+800d);
        }
        
    }//Fin precioFinal
}
