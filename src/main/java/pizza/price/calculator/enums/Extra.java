package pizza.price.calculator.enums;

public enum Extra {

    BACON(1, "Bacon", 5.0),
    MOLHO(2, "Molho", 2.0),
    ERVILHA(3, "Ervilha", 2.0),
    CEBOLA(4, "Cebola", 0.50),
    ALHO(5, "Alho", 0.50),
    TOMATE(6, "Tomate", 0.50),
    OREGANO(7, "Oregano", 0.0),
    SAL(8, "Sal", 0.0),
    MOLHO_DE_TOMATE(9, "Molho de tomate", 1.0);

    private final Integer option;
    private final String description;
    private final double price;

    Extra(Integer option, String description, double price) {
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

    public static Extra toEnum(Integer option){
        if (option == null){
            return null;
        }

        for (Extra extra : Extra.values()){
            if (option.equals(extra.getOption())){
                return extra;
            }
        }
        throw new IllegalArgumentException("Opção inválida");
    }
}
