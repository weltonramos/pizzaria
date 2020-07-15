package pizza.price.calculator.enums;

public enum Flavor {

    MUÇARELA(1, "Muçareça"),
    PRESUNTO(2, "Presunto"),
    CALABRESA(3, "Calabresa"),
    FRANGO(4, "Frango"),
    ATUM(5, "Atum");

    private Integer option;
    private String description;

    Flavor (Integer option, String description){
        this.option = option;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Integer getOption() {
        return option;
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
