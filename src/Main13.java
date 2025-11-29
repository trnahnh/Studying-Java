public class Main13 {
    public static void main(String[] args) {

        String name = "Anh Tran";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex= name.lastIndexOf("o");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("o", "a");

        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        }
        else {
            System.out.println("Hello " + name);
        }
    }
}
