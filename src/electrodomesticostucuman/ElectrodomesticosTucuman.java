/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.

10
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
 */
package electrodomesticostucuman;

import electrodomesticostucuman.entidades.Lavadora;
import electrodomesticostucuman.entidades.Televisor;
import electrodomesticostucuman.servicios.LavadoraServicios;
import electrodomesticostucuman.servicios.TelevisorServicios;

/**
 *
 * @author Carlitox
 */
public class ElectrodomesticosTucuman {

  
    public static void main(String[] args) {//MAIN
        TelevisorServicios televisorServicios = new TelevisorServicios();
        LavadoraServicios lavadoraServicios = new LavadoraServicios();
        
        Lavadora lavadora = lavadoraServicios.CreaLavadora();
        Televisor televisor = televisorServicios.CrearTelevisor();
        
        System.out.println("Precio del televisor $: " +televisor.getPrecio());
        System.out.println("Precio del lavadora $: " +lavadora.getPrecio());
        
        televisorServicios.precioFinal(televisor);
        lavadoraServicios.precioFinal(lavadora);
        
        System.out.println("\nDespues de calcular el precio final");
        System.out.println("Precio del televisor $: " +televisor.getPrecio());
        System.out.println("Precio del lavadora $: " +lavadora.getPrecio());
        
    }//FIN MAIN
    
}
