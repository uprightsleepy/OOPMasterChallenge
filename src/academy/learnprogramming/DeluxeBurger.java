package academy.learnprogramming;

public class DeluxeBurger extends Burger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addBurgerAddition1("Chips", 2.75);
        super.addBurgerAddition2("Drink", 1.85);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }
}
