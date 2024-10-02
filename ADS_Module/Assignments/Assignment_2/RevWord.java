import java.util.Scanner;

public class RevWord{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        
        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();
    
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
    
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        System.out.println("Reversed Sentence: " + reversedSentence.toString());
        scan.close();
    }
}