public class SausageBoard extends PizzaDecorator{

    public SausageBoard(Pizza pizza, double price, String pizzaNames) {
        super(pizza, price, pizzaNames);
    }

    @Override
    public String pizzaNames() {
        return super.pizzaNames()+ " with sausage board";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+50;

    }
}
