import java.util.Scanner;
public class Emailvalidator{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String input = n.nextLine();

        String email = input.trim();

        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");
        boolean endsCorrectly = email.endsWith(".com") || email.endsWith(".in");
        boolean hasNospaces = !email.contains(" ");

        if(hasAt && hasDot && endsCorrectly && hasNospaces) {
            System.out.println("Valid Email: " + email.toLowerCase());
        }
        else {
            System.out.println("Invalid Email! please enter a correct one.");
        }
        n.close();
    }
}