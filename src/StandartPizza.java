public  class StandartPizza implements Pizza {

    private final long price;
    private final String name;
    public StandartPizza(long price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public long getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Total price order is: " + getPrice() + ", pizza is -  " + getName() + ".";
    }
    
}
