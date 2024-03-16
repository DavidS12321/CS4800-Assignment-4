class Customer {
    private String name;
    private DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public void generateMeal() {
        System.out.println("\n" + getName() + "'s " + getDietPlan() + " Meal:");

        MacronutrientFactory factory = MacronutrientFactory.getInstance();
        DietPlan dietPlan = getDietPlan();

        String carbs = factory.createCarbsFactory(dietPlan).create();
        String protein = factory.createProteinFactory(dietPlan).create();
        String fats = factory.createFatsFactory(dietPlan).create();

        System.out.println("Carbs: " + carbs);
        System.out.println("Protein: " + protein);
        System.out.println("Fats: " + fats);
    }
}