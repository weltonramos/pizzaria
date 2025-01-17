package pizza.price.calculator.enums;

public enum Flavor {

    MUCARELA(1, "Muçarela", 8.00),
    PRESUNTO(2, "Presunto", 8.00),
    CALABRESA(3, "Calabresa", 10.00),
    FRANGO(4, "Frango", 10.00),
    ATUM(5, "Atum", 15.00);

    private final Integer option;
    private final String description;
    private final double price;

    Flavor (Integer option, String description, double price){
        this.option = option;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public Integer getOption() {
        return option;
    }

    public double getPrice() {
        return price;
    }

    public static Flavor toEnum(Integer option){
        if (option == null){
            return null;
        }
        for (Flavor flavor : Flavor.values()) {
            if (option.equals(flavor.getOption())) {
                return flavor;
            }
        }
        throw new IllegalArgumentException("Opção inválida");
    }
}
