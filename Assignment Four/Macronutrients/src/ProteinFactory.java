import java.util.Random;

public class ProteinFactory {

    private final DietPlan dietPlan;

    public ProteinFactory(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    public String create() {
        Random random = new Random();

                switch (dietPlan) {
                    case NO_RESTRICTION, NUT_ALLERGY:
                        String[] proteinNoRestriction = {"Fish", "Chicken", "Beef", "Tofu"};
                        return proteinNoRestriction[random.nextInt(proteinNoRestriction.length)];
                    case PALEO:
                        String[] proteinPaleo = {"Fish", "Chicken", "Beef"};
                        return proteinPaleo[random.nextInt(proteinPaleo.length)];
                    case VEGAN:
                        return "Tofu";
                    default:
                        return null;
                }
    }
}