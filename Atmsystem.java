import java.util.Scanner;
import java.util.LinkedList;
public class Atmsystem{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        boolean i = true;
        String accno = "898563";
        int pin = 5127;
        double bal = 6000;
        LinkedList<String> transactions = new LinkedList<>();
        
        System.out.print("Enter the account number: ");
        String newacc = s.next();
        System.out.print("enter the pin: ");
        int cpin = s.nextInt();
        
        if(accno.equals(newacc) && pin == cpin)
        {
            System.out.println("Login successfull!");
            
            while(i)
            {
                System.out.print("\n\nATM menu: \n");
                System.out.println("1. check balance");
                System.out.println("2. deposite");
                System.out.println("3. withdrawl");
                System.out.println("4. mini statement");
                System.out.println("5. exit:");
                System.out.println("Choose an option: ");
                
                int c = s.nextInt();
                
                
                switch(c)
                {
                    case 1:
                        System.out.print("your balance is : $" + bal);
                        break;
                    case 2:
                        System.out.print("enter the deposite amount: ");
                        double damount = s.nextDouble();
                        if(damount>0){
                            bal += damount;
                            transactions.add("deposited: $"+damount);
                            if(transactions.size()>5){
                                transactions.removeFirst();
                            }
                            System.out.println("Deposite successful! new balance: $" + bal);
                        }else{
                            System.out.println("Invalid deposite amount!");
                        }
                        break;
                    case 3:
                        System.out.println("Enter withdrawal amount: ");
                        double wamount = s.nextDouble();
                        if(wamount>0){
                            bal -= wamount;
                            transactions.add("deposited: $"+wamount);
                            if(transactions.size()>5){
                                transactions.removeFirst();
                            }
                            System.out.println("Deposite successful! new balance: $" + bal);
                        }else{
                            System.out.println("Invalid withdrawal amount! or insufficient funds!");
                        }
                        break;
                    case 4:
                        System.out.println("\nMini Statement (Last 5 transactions):");
                        if (transactions.isEmpty()) {
                            System.out.println("No transactions yet.");
                        } else {
                            for (String transaction : transactions) {
                                System.out.println(transaction);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM!\nhave a nice day");
                        i = false;
                        break;
                    default:
                        System.out.println("Invalid choice! try again.");
                        break;
                }
            }
        }else{
            System.out.println("Invalid account number or PIN. Access denied.");
        }
    }
}