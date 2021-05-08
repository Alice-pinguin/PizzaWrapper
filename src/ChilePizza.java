public class ChilePizza extends PizzaDecorator {
    public ChilePizza(Pizza pizza, double price, String pizzaNames) {
        super(pizza, price, pizzaNames);
    }

    @Override
    public String pizzaNames() {
        return super.pizzaNames()+" with chile sauce";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+20;
    }
}
