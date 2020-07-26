package pizza.price.calculator.model;

import pizza.price.calculator.enums.Extra;
import pizza.price.calculator.enums.Flavor;
import pizza.price.calculator.enums.Pasta;

import java.util.List;
import java.util.Set;

public class Pizza {

    private Pasta pasta;
    private List<Flavor> flavors;
    private Set<Extra> extras;
    private double price = 0.00;

    public Pasta getPasta() {
        return pasta;
    }

    public void setPasta(Pasta pasta) {
        this.pasta = pasta;
    }

    public List<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    public Set<Extra> getExtras() {
        return extras;
    }

    public void setExtras(Set<Extra> extras) {
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
        return "Massa : " + pasta +
                "\nRecheio(s) : " + flavors +
                "\nIngredientes adicionais : " + extras +
                "\nValor : " + price;
    }
}
