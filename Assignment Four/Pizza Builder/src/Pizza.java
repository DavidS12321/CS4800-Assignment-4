import java.util.List;

public class Pizza {
    private String size;
    private String name;
    private final List<String> toppings;

    public Pizza(String name, String size, List<String> toppings){
        this.size = size;
        this.name = name;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Chain: " + name);
        System.out.println("Size: " + size);
        System.out.println("Toppings:");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
    }
}