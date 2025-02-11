package Day1Generics.PersonalizedMealPlanGenerator;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MealPlannerTest {

    @Test
    public void testMealCreation() {
        Meal<VeganMeal> veganMeal = new Meal<>("VG002", 550, new VeganMeal());
        assertEquals("Vegan Meal", veganMeal.getMealType().getMealName());
        assertEquals(550, veganMeal.getCalories());
    }

    @Test
    public void testMealIngredients() {
        Meal<KetoMeal> ketoMeal = new Meal<>("K003", 700, new KetoMeal());
        assertEquals("Ingredients: High-Fat Protein, Cheese, Avocados, Low-Carb Veggies", ketoMeal.getMealType().getIngredients());
    }

    @Test
    public void testGenerateMealPlan() {
        List<MealPlan> meals = Arrays.asList(
                new VegetarianMeal(),
                new VeganMeal(),
                new KetoMeal(),
                new HighProteinMeal()
        );
        assertDoesNotThrow(() -> MealPlanner.generateMealPlan(meals));
    }
}


