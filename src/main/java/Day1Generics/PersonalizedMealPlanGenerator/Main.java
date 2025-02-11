package Day1Generics.PersonalizedMealPlanGenerator;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating different meal objects
        Meal<VegetarianMeal> vegMeal = new Meal<>("V001", 600, new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>("VG002", 550, new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>("K003", 700, new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>("HP004", 750, new HighProteinMeal());

        // Displaying individual meals
        System.out.println("Meal Details:");
        System.out.println(vegMeal);
        System.out.println(veganMeal);
        System.out.println(ketoMeal);
        System.out.println(proteinMeal);

        // Generating a meal plan dynamically
        List<? extends MealPlan> mealList = Arrays.asList(
                new VegetarianMeal(),
                new VeganMeal(),
                new KetoMeal(),
                new HighProteinMeal()
        );

        System.out.println("\nGenerated Personalized Meal Plan:");
        MealPlanner.generateMealPlan(mealList);
    }
}


