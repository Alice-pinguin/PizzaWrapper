public class CheeseBoard extends PizzaDecorator{
    public CheeseBoard(Pizza pizza, double price, String pizzaNames) {
        super(pizza, price, pizzaNames);
    }

    @Override
    public String pizzaNames() {
        return super.pizzaNames()+" with cheese board";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+30;
    }
}
