package pizza.price.calculator.enums;

public enum Flavor {

    MUÇARELA(1),
    PRESUNTO(2),
    CALABRESA(3),
    FRANGO(4),
    ATUM(5);

    private int option;

    Flavor (int option){
        this.option = option;
    }
}
