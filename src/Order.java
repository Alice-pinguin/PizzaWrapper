public class Order {
    public static void main(String[] args) {
        Pizza margarita = new StandartPizza(70, "Margarita");
        System.out.println("Total price order is: "+margarita.getPrice()+
                ", pizza is - " +margarita.pizzaNames()+ ".");
        margarita = new DoubleStuffing(margarita, 70, "Margarita");
        System.out.println("Total price order is: "+margarita.getPrice()+", pizza is -  "
                +margarita.pizzaNames()+".");
        margarita = new ChilePizza(margarita, 70, "Margarita");
        System.out.println("Total price order is: "+margarita.getPrice()+", pizza is -  "
                +margarita.pizzaNames()+".");
    }
}

