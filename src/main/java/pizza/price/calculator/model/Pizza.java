package pizza.price.calculator.model;

import pizza.price.calculator.enums.Extra;
import pizza.price.calculator.enums.Flavor;
import pizza.price.calculator.enums.Pasta;

import java.util.Arrays;

public class Pizza {

    private Pasta pasta;
    private Flavor[] flavors;
    private Extra[] extras;
    private double price = 0.00;

    public Pasta getPasta() {
        return pasta;
    }

    public void setPasta(Pasta pasta) {
        this.pasta = pasta;
    }

    public Flavor[] getFlavors() {
        return flavors;
    }

    public void setFlavors(Flavor[] flavors) {
        this.flavors = flavors;
    }

    public Extra[] getExtras() {
        return extras;
    }

    public void setExtras(Extra[] extras) {
        this.extras = extras;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = this.price + price;
    }

    @Override
    public String toString() {
        return "Sua pizza" +
                "Massa:" + pasta +
                "Recheio: " + Arrays.toString(flavors) +
                "Extras: " + Arrays.toString(extras) +
                "Valor: " + price;
    }
}
