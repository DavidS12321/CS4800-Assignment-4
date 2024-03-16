import java.util.Random;

public class FatsFactory {

    private final DietPlan dietPlan;

    public FatsFactory(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    public String create() {
        Random random = new Random();

                switch (dietPlan) {
                    case NO_RESTRICTION:
                        String[] fatsNoRestriction = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
                        return fatsNoRestriction[random.nextInt(fatsNoRestriction.length)];
                    case PALEO:
                        String[] fatsPaleo = {"Avocado", "Tuna"};
                        return fatsPaleo[random.nextInt(fatsPaleo.length)];
                    case VEGAN:
                        return "Avocado";
                    case NUT_ALLERGY:
                        String[] fatsNutAllergy = {"Avocado", "Sour cream", "Tuna"};
                        return fatsNutAllergy[random.nextInt(fatsNutAllergy.length)];
                    default:
                        return null;
                }
    }
}