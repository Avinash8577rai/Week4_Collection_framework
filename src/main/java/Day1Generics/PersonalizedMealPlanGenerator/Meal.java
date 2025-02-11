package Day1Generics.PersonalizedMealPlanGenerator;


    public class Meal<T extends MealPlan> {
        private String mealId;
        private int calories;
        private T mealType;

        public Meal(String mealId, int calories, T mealType) {
            this.mealId = mealId;
            this.calories = calories;
            this.mealType = mealType;
        }

        public String getMealId() { return mealId; }
        public int getCalories() { return calories; }
        public T getMealType() { return mealType; }

        @Override
        public String toString() {
            return "Meal ID: " + mealId + " | " +
                    "Calories: " + calories + " | " +
                    "Type: " + mealType.getMealName() + " | " +
                    mealType.getIngredients();
        }
    }

