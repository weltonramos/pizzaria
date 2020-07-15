package pizza.price.calculator.enums;

public enum Pasta {

    TRADICIONAL(1, "Tradicional"),
    INTEGRAL(2, "Integral"),
    BROCOLIS(3, "Brócolis"),
    SEM_GLUTEN_E_SEM_LACTOSE(4, "Sem gluten e sem lactose"),
    TAPIOCA(5, "Tapioca");

    private Integer option;
    private String description;

    Pasta(int option, String description){
        this.option = option;
        this.description = description;
    }

    public Integer getOption() {
        return option;
    }

    public String getDescription() {
        return description;
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
