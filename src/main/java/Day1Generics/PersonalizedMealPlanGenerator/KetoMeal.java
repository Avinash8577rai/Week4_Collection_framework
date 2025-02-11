package Day1Generics.PersonalizedMealPlanGenerator;



    public class KetoMeal implements MealPlan {
        @Override
        public String getMealName() {
            return "Keto Meal";
        }

        @Override
        public String getIngredients() {
            return "Ingredients: High-Fat Protein, Cheese, Avocados, Low-Carb Veggies";
        }
    }


