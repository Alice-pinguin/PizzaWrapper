public class DoubleStuffing extends PizzaDecorator{

    public DoubleStuffing(Pizza pizza, double price, String pizzaNames) {
        super(pizza, price, pizzaNames);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()*2;
    }

    @Override
    public String pizzaNames() {
        return super.pizzaNames()+" double stuffing";
    }
}
