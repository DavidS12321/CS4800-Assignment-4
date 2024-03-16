public class Main {
    public static void main(String[] args){

        Pizza pizzaOne = new PizzaBuilder().setSize("Small").setName("Pizza Hut").addPepperoni().addMushrooms().addExtraCheese().build();
        Pizza pizzaTwo = new PizzaBuilder().setSize("Medium").setName("Pizza Hut").addPepperoni().addMushrooms().addExtraCheese().addOnions().addBacon().addOlives().build();
        Pizza pizzaThree = new PizzaBuilder().setSize("Large").setName("Pizza Hut").addPepperoni().addMushrooms().addExtraCheese().addOnions().addBacon().addOlives().addSausage().addChicken().addPeppers().build();

        System.out.println("\nMy Pizzas:");
        pizzaOne.eat();
        System.out.println();
        pizzaTwo.eat();
        System.out.println();
        pizzaThree.eat();

        Pizza pizzaHut1 = new PizzaBuilder().setSize("Large").setName("Pizza Hut").addPepperoni().addMushrooms().addExtraCheese().build();
        Pizza pizzaHut2 = new PizzaBuilder().setSize("Small").setName("Pizza Hut").addPepperoni().addMushrooms().build();

        Pizza pizzaLC1 = new PizzaBuilder().setSize("Medium").setName("Little Caesars").addPepperoni().addMushrooms().addExtraCheese().addOnions().addBacon().addOlives().addSausage().addChicken().build();
        Pizza pizzaLC2 = new PizzaBuilder().setSize("Small").setName("Little Caesars").addPepperoni().addMushrooms().addExtraCheese().addOnions().addBacon().addOlives().build();

        Pizza pizzaDominos1 = new PizzaBuilder().setSize("Small").setName("Dominos").addPepperoni().build();
        Pizza pizzaDominos2 = new PizzaBuilder().setSize("Large").setName("Dominos").addPepperoni().addMushrooms().addExtraCheese().build();

        System.out.println("\nPizza Hut Pizzas:");
        pizzaHut1.eat();
        System.out.println();
        pizzaHut2.eat();

        System.out.println("\nLittle Caesar's Pizzas:");
        pizzaLC1.eat();
        System.out.println();
        pizzaLC2.eat();

        System.out.println("\nDominos Pizzas:");
        pizzaDominos1.eat();
        System.out.println();
        pizzaDominos2.eat();

    }
}