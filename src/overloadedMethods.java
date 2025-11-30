public class overloadedMethods {
    public static void main(String[] args) {

        // Overloaded methods = methods share same name but different params

        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");

        System.out.println(pizza);

    }
    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return cheese + " "  + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " "  + bread + " pizza";
    }
}
