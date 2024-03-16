import java.util.Random;

public class CarbsFactory extends MacronutrientFactoryImpl {
    private DietPlan dietPlan;

    public CarbsFactory(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    public String create() {
        Random random = new Random();

        switch (dietPlan) {
            case NO_RESTRICTION:
                String[] carbsNoRestriction = {"Cheese", "Bread", "Lentils", "Pistachio"};
                return carbsNoRestriction[random.nextInt(carbsNoRestriction.length)];
            case PALEO:
                return "Pistachio";
            case VEGAN:
                String[] carbsVegan = {"Bread", "Lentils"};
                return carbsVegan[random.nextInt(carbsVegan.length)];
            case NUT_ALLERGY:
                String[] carbsNutAllergy = {"Cheese", "Bread", "Lentils"};
                return carbsNutAllergy[random.nextInt(carbsNutAllergy.length)];
            default:
                return null;
        }
    }
}