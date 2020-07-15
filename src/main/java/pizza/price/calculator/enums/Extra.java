package pizza.price.calculator.enums;

public enum Extra {

    BACON(1, "Bacon"),
    MOLHO(2, "Molho"),
    ERVILHA(3, "Ervilha"),
    CEBOLA(4, "Cebola"),
    ALHO(5, "Alho"),
    TOMATE(6, "Tomate"),
    OREGANO(7, "Oregano"),
    SAL(8, "Sal"),
    MOLHO_DE_TOMATE(9, "Molho de tomate");

    private final Integer option;
    private final String description;

    Extra(Integer option, String description) {
        this.option = option;
        this.description = description;
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
