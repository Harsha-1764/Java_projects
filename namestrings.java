import java.util.Scanner;

public class namestrings {

    // Method to attempt character change (to demonstrate immutability)
    public static void tryCharChange(String str) {
        try {
            // Simulate change (Java doesn't support this directly)
            char[] chars = str.toCharArray();
            chars[0] = 'X';
            String changed = new String(chars);
            System.out.println("After trying to change 1st char: " + changed);
        } catch (Exception e) {
            System.out.println("Cannot change individual characters in a String directly!");
        }
    }

    // Method to apply transformations
    public static void showTransformations(String str) {
        String concatStr = str.concat(" Neha");
        String upperStr = str.toUpperCase();
        String replacedStr = str.replace("a", "*");

        System.out.println("\n--- String Transformations ---");
        System.out.println("Original         : " + str);
        System.out.println("After concat     : " + concatStr);
        System.out.println("After toUpperCase: " + upperStr);
        System.out.println("After replace    : " + replacedStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Step 2: Try character change
        tryCharChange(name);

        // Step 3: Apply and show string operations
        showTransformations(name);

        // Step 4: Confirm immutability
        System.out.println("\n✅ Final Check - Original name is still: " + name);

        sc.close();
    }
}
