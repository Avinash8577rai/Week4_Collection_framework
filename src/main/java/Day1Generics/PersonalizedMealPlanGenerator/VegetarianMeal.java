package Day1Generics.PersonalizedMealPlanGenerator;


    public class VegetarianMeal implements MealPlan {
        @Override
        public String getMealName() {
            return "Vegetarian Meal";
        }

        @Override
        public String getIngredients() {
            return "Ingredients: Vegetables, Lentils, Tofu, Rice";
        }
    }

