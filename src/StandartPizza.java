public  class StandartPizza implements Pizza {
    private double price;
    private String pizzaNames;

    public StandartPizza(double price, String pizzaNames) {
        this.price = price;
        this.pizzaNames = pizzaNames;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
    @Override
    public String pizzaNames() {
        return this.pizzaNames;
    }
}
