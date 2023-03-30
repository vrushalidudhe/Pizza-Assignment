package Second;

public class PizzaBuild {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setPizzaBase(new PizzaTopping("thin", 10, false));
		pizza.addTopping(new PizzaTopping("Tomato Sauce", 10, false));
		pizza.addTopping(new PizzaTopping("Cheese", 35, false));
		pizza.addTopping(new PizzaTopping("Ham", 1.25, true));
		pizza.addTopping(new PizzaTopping("Pineapple", 1.25, false));
		pizza.total();

	}

}
