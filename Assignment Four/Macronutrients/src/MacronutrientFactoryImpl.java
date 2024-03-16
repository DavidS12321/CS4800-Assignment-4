public class MacronutrientFactoryImpl extends MacronutrientFactory {
    protected MacronutrientFactoryImpl() {}

    public CarbsFactory createCarbsFactory(DietPlan dietPlan) {
        return new CarbsFactory(dietPlan);
    }

    public ProteinFactory createProteinFactory(DietPlan dietPlan) {
        return new ProteinFactory(dietPlan);
    }

    public FatsFactory createFatsFactory(DietPlan dietPlan) {
        return new FatsFactory(dietPlan);
    }
}