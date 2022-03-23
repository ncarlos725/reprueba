/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticostucuman.entidades;

/**
 *
 * @author Carlitox
 */
public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Integer peso;
    protected char consumoEnergetico;

    // Constructor vacio
    public Electrodomestico() {
    }

    //Constructor con parametros
    public Electrodomestico(Double precio, String color, Integer peso, char consumoEnergetico) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.peso = peso;
        this.consumoEnergetico = comprobarConsumoEnergeico(consumoEnergetico);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
// Metodos 

    public char comprobarConsumoEnergeico(char letra) {
//        String l = String.valueOf(letra);
//        if (l.equalsIgnoreCase("A") || l.equalsIgnoreCase("B")) {
//            return letra;
//        } else {
//            return 'F';
//        }

        switch (letra) {
            case 'A':
            case 'a':
            case 'B':
            case 'b':
            case 'C':
            case 'c':
            case 'D':
            case 'd':
            case 'E':
            case 'e':
                return letra;
            default:
                return 'F';
        }

    }//Fin comprobarConsumoEnergico

//    public boolean recorrerLetras(String letra) {
//        String[] letras = {"A", "B", "C", "D", "E"};
//        Boolean estaBien = true;
//        for (String letra2 : letras) {
//            estaBien = letra2.equalsIgnoreCase(letra);
//            if (estaBien) {
//                break;
//            }
//        }
//        return estaBien;
//    }//Fin recorrerLetra
    public String comprobarColor(String color) {
       color = color.toLowerCase();
        switch (color) {
            case "negro":
            case "rojo":
            case "gris":
            case "azul":
                return color;
            default:
                return "blanco";
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", peso=" + peso + ", consumoEnergetico=" + consumoEnergetico + '}';
    }

    public char comprobarConsumoEnergeico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}//Fin Class Electrodomestico
