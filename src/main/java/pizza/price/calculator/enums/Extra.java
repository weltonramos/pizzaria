package pizza.price.calculator.enums;

public enum Extra {

    BACON(1),
    MOLHO(2),
    ERVILHA(3),
    CEBOLA(4),
    ALHO(5),
    TOMATE(6),
    OREGANO(7),
    SAL(8),
    MOLHO_DE_TOMATE(9);

    private int option;

    Extra(int option){
        this.option = option;
    }
}
