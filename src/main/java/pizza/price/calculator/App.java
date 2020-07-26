package pizza.price.calculator;

import pizza.price.calculator.enums.Extra;
import pizza.price.calculator.enums.Flavor;
import pizza.price.calculator.enums.Pasta;
import pizza.price.calculator.model.Pizza;

import java.util.*;

public class App {
    private static final String OPCAO_INVALIDA = "Opção inválida!";

    public static void main(String[] args) {
        try{
            System.out.println("Bem-vindo a Caedson Pizzaria!");
            System.out.println("Escolha o tipo da massa da sua pizza:\n");

            Scanner scanner = new Scanner(System.in);

            pastaMenu();

            Pasta pasta = selectPasta(scanner);

            System.out.println("Escolha o recheio de sua pizza:");
            List<Flavor> flavorList = new ArrayList<>();
            flavorList.add(selectFlavor(scanner));

            System.out.println("Deseja acrescentar algum recheio extra? (Y/N)");
            extraFlavor(scanner, flavorList);

            System.out.println("Deseja acrescentar algum ingrediente extra? (Y/N)");
            String extra = scanner.next();

            Set<Extra> extraSet = new HashSet<>();

            while (!extra.equalsIgnoreCase("n")) {
                if (extra.equalsIgnoreCase("y")) {
                    selectExtra(scanner, extraSet);
                } else {
                    System.out.println(OPCAO_INVALIDA);
                }
                System.out.println("Deseja algum ingrediente extra? (Y/N)");
                extra = scanner.next();
            }

            Pizza pizza = new Pizza();

            pizza.setPasta(pasta);
            pizza.setPrice(Pasta.toEnum(pasta.getOption()).getPrice());
            pizza.setFlavors(flavorList);
            pizza.setExtras(extraSet);

            if (flavorList.size() > 1) {
                pizza.setPrice(flavorList.get(0).getPrice());
                for (int i = 1; i < flavorList.size(); i++) {
                    pizza.setPrice(flavorList.get(i).getPrice() * 0.75);
                }
            } else {
                pizza.setPrice(flavorList.get(0).getPrice());
            }

            if (!extraSet.isEmpty()) {
                extraSet.forEach(ingredient -> pizza.setPrice(ingredient.getPrice() * 0.95));
            }
            System.out.println(pizza.toString());

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void pastaMenu() {
        System.out.println("1 - Tradicional\n2 - Integral\n3 - Brócolis\n4 - Sem gluten e sem lactose\n5 - Tapioca");
    }

    private static void flavorMenu() {
        System.out.println("1 - Muçarela\n2 - Presunto\n3 - Calabresa\n4 - Frango\n5 - Atum");
    }

    private static Pasta selectPasta(Scanner scanner) {

        int pasta = scanner.nextInt();

        while (pasta < 1 || pasta > 5) {
            System.out.println(OPCAO_INVALIDA);
            pasta = scanner.nextInt();
        }
        return Pasta.toEnum(pasta);
    }

    private static Flavor selectFlavor(Scanner scanner) {
        flavorMenu();
        int flavor = scanner.nextInt();

        while (flavor < 1 || flavor > 5) {
            System.out.println(OPCAO_INVALIDA);
            flavor = scanner.nextInt();
        }
        System.out.println("Recheio: " + Flavor.toEnum(flavor) + " R$ " + Flavor.toEnum(flavor).getPrice());
        return Flavor.toEnum(flavor);
    }

    private static void extraFlavor(Scanner scanner, List<Flavor> flavorList) {
        String option = scanner.next();

        while (!option.equalsIgnoreCase("n")) {
            if (option.equalsIgnoreCase("y")) {
                flavorList.add(selectFlavor(scanner));
            } else {
                System.out.println(OPCAO_INVALIDA);
            }
            System.out.println("Mais um recheio extra? (Y/N)");
            option = scanner.next();
        }
    }

    private static void extraMenu() {
        System.out.println("1 - Bacon\n2 - Molho\n3 - Ervilha\n4 - Cebola\n5 - Alho\n6 - Tomate\n" +
                "7 - Oregano\n8 - Sal\n9 - Molho de tomate");
    }

    private static Set<Extra> selectExtra(Scanner scanner, Set<Extra> extraSet) {
        extraMenu();
        int extra = scanner.nextInt();

        while (extra < 0 || extra > 5) {
            System.out.println(OPCAO_INVALIDA);
            extra = scanner.nextInt();
        }
        extraSet.add(Extra.toEnum(extra));

        return extraSet;
    }
}
