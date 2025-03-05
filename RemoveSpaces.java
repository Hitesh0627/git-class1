import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); 

        String trimmedInput = userInput.trim(); 
        String withoutSpaces = trimmedInput.replaceAll("\\s+", ""); 
        
        System.out.println("Original Input: [" + userInput + "]");
        System.out.println("Trimmed & Space Removed: [" + withoutSpaces + "]");
    }
}
