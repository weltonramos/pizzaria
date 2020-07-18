package pizza.price.calculator;

import pizza.price.calculator.enums.Pasta;
import pizza.price.calculator.model.Pizza;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());

        System.out.println("Bem-vindo a Caedson Pizzaria!");
        System.out.println("Escolha o tipo da massa da sua pizza:\n");

        pastaMenu();

        Scanner scanner = new Scanner(System.in);
        int pasta = scanner.nextInt();

        while (pasta < 1 || pasta > 5) {
            System.out.println("Opção inválida");
            pasta = scanner.nextInt();
        }

        Pizza pizza = new Pizza();
        pizza.setPasta(Pasta.toEnum(pasta));
        pizza.setPrice(Pasta.toEnum(pasta).getPrice());

        System.out.println("Massa: " + pizza.getPasta().getDescription() +
                " - R$" + pizza.getPrice());

        System.out.println("Escolha o sabor de sua pizza:");

        selectFlavor(scanner);

        System.out.println("Deseja acrescentar algum recheio extra?");
        String option = scanner.next();
    }

    private static void pastaMenu() {
        System.out.println("1 - Tradicional\n2 - Integral\n3 - Brócolis\n4 - Sem gluten e sem lactose\n5 - Tapioca");
    }

    private static void flavorMenu() {
        System.out.println("1 - Muçarela\n2 - Presunto\n3 - Calabresa\n4 - Frango\n5 - Atum");
    }

    private static void extraMenu() {
        System.out.println("1 - Bacon\n2 - Molho\n3 - Ervilha\n4 - Cebola\n5 - Alho\n6 - Tomate\n" +
                "7 - Oregano\n8 - Sal\n9 - Molho de tomate");
    }

    private static void selectFlavor(Scanner scanner){
        flavorMenu();

        int flavor = scanner.nextInt();

        while (flavor < 1 || flavor > 5) {
            System.out.println("Opção inválida");
            flavor = scanner.nextInt();
        }
    }
}
