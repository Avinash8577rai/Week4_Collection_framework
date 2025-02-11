package Day1Generics.PersonalizedMealPlanGenerator;


    public class HighProteinMeal implements MealPlan {
        @Override
        public String getMealName() {
            return "High-Protein Meal";
        }

        @Override
        public String getIngredients() {
            return "Ingredients: Chicken, Eggs, Fish, Greek Yogurt, Beans";
        }
    }


