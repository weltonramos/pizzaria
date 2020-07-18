package pizza.price.calculator.enums;

public enum Pasta {

    TRADICIONAL(1, "Tradicional", 20.00),
    INTEGRAL(2, "Integral",25.00),
    BROCOLIS(3, "Brócolis",28.00),
    SEM_GLUTEN_E_SEM_LACTOSE(4, "Sem gluten e sem lactose", 30.00),
    TAPIOCA(5, "Tapioca", 35.00);

    private final Integer option;
    private final String description;
    private final double price;

    Pasta(int option, String description, double price){
        this.option = option;
        this.description = description;
        this.price = price;
    }

    public Integer getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public static Pasta toEnum (Integer option){
        if (option == null){
            return null;
        }
        for (Pasta pasta : Pasta.values()){
            if (option.equals(pasta.option)){
                return pasta;
            }
        }
        throw new IllegalArgumentException("Opção inválida");
    }
}
