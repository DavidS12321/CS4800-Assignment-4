import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<DietPlan> dietPlans = List.of(
                DietPlan.NO_RESTRICTION,
                DietPlan.PALEO,
                DietPlan.VEGAN,
                DietPlan.NUT_ALLERGY
        );

        List<String> customerNames = List.of(
                "David", "Bob", "Anna", "Kevin", "Emma", "Jack"
        );

        List<Customer> customers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            String name = customerNames.get(i);
            DietPlan dietPlan = dietPlans.get(random.nextInt(dietPlans.size()));
            Customer customer = new Customer(name, dietPlan);
            customers.add(customer);
        }

        for (Customer customer : customers) {
            customer.generateMeal();
        }
    }
}