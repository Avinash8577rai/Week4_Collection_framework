package Day1Generics.PersonalizedMealPlanGenerator;



public class VeganMeal implements MealPlan {
    @Override
    public String getMealName() {
        return "Vegan Meal";
    }

    @Override
    public String getIngredients() {
        return "Ingredients: Plant-based Protein, Vegetables, Quinoa, Nuts";
    }
}

