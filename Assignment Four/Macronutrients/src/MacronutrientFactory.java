public abstract class MacronutrientFactory {
    private static MacronutrientFactory instance;

    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactoryImpl();
        }
        return instance;
    }

    public abstract CarbsFactory createCarbsFactory(DietPlan dietPlan);
    public abstract ProteinFactory createProteinFactory(DietPlan dietPlan);
    public abstract FatsFactory createFatsFactory(DietPlan dietPlan);
}