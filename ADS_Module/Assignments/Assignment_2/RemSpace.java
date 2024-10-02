public class RemSpace {
    public static void main(String[] args) {
        String input = "  Hello   World ! This is to remove spaces .  ";
  
        String result = input.replaceAll("\\s+","");

        System.out.println("Original String: \"" + input + "\"");
        System.out.println("String without white spaces: \"" + result + "\"");
    }
}