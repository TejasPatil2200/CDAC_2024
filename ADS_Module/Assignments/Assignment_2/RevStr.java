public class RevStr {
    public static void main(String[] args) {
        String input = "Hello, World!";
   
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Reversed String: \"" + reversed + "\"");
    }
}