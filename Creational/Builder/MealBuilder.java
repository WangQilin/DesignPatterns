package Test;

public class MealBuilder {
	public Meal prepareSetMeal1() {
		Meal meal = new Meal();
		meal.addItem(new DoubleCheeseBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareSetMeal2() {
		Meal meal = new Meal();
		meal.addItem(new BigMac());
		meal.addItem(new Pepsi());
		return meal;
	}
}
