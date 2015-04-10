package builder;

//Builder pattern is introduced to solve some of the problems with Factory and Abstract Factory
//design patterns when the Object contains too many attributes. It provides a step-by-step approach
//to construct Object.

public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal meal1 = mealBuilder.prepareSetMeal1();
		Meal meal2 = mealBuilder.prepareSetMeal2();

		meal1.showItems();
		System.out.println("meal 1 total cost:" + meal1.getCost());

		System.out.println();

		meal2.showItems();
		System.out.println("meal 2 total cost:" + meal2.getCost());
	}
}
