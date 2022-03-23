
package electrodomesticostucuman.entidades;

/**
 *
 * @author Carlitox
 */
public class Televisor extends Electrodomestico{
    private Double pulgadas;
    private Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double pulgadas, Boolean sintonizadorTDT) {
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Double pulgadas, Boolean sintonizadorTDT, Double precio, String color, Integer peso, char consumoEnergetico) {
        super(precio, color, peso, consumoEnergetico);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

}
