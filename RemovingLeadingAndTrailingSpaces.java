import java.util.Scanner;

public class RemovingLeadingAndTrailingSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); 
        
        String trimmedInput = userInput.trim(); 
        
        System.out.println("Original Input: [" + userInput + "]");
        System.out.println("Trimmed Input: [" + trimmedInput + "]");
    }
}

