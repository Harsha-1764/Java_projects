import java.util.Scanner;
public class Secretcode{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your full name:");
        String name = s.nextLine();
        String[] parts = name.split(" ");
        String first = parts[0];
        String last = parts[parts.length - 1];

        String firstpart = "";
        String lastpart = "";

        if(first.length() >= 3) {
            firstpart = first.substring(0,3);
        }else{
            firstpart = first;
        }
        if (last.length() >= 3) {
            lastpart = last.substring(last.length() - 3);
        } else {
          lastpart = last;  
        }
        String codename = (firstpart + lastpart).toUpperCase() + "@2025";

        System.out.println("Your Secret codename: " + codename);
        s.close();
    }
}
