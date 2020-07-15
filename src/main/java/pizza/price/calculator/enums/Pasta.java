package pizza.price.calculator.enums;

public enum Pasta {

    TRADICIONAL(1),
    INTEGRAL(2),
    BROCOLIS(3),
    SEM_GLUTEN_E_SEM_LACTOSE(4),
    TAPIOCA(5);

    private int option;

    Pasta(int option){
        this.option = option;
    }
}
