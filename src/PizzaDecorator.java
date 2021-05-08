public abstract class PizzaDecorator  implements Pizza{
    public Pizza pizza;
    private double price;
    private String pizzaNames;

    public PizzaDecorator(Pizza pizza, double price, String pizzaNames) {
        this.pizza = pizza;
        this.price = price;
        this.pizzaNames = pizzaNames;
    }

    public abstract double getPrice();

    public String pizzaNames() {
        return pizza.pizzaNames()+", "+this.pizzaNames;
    }
}
