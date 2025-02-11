package Day1Generics.PersonalizedMealPlanGenerator;

import java.util.List;

    public class MealPlanner {
        public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
            System.out.println("Generated Personalized Meal Plan:");
            for (T meal : meals) {
                System.out.println(meal.getMealName() + " - " + meal.getIngredients());
            }
        }
    }


