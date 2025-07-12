import java.util.Scanner;
public class Rank_Analyzer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = s.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter marks of " + n + " Students:");
        for(int i = 0; i < n; i++){
            marks[i] = s.nextInt();
        }
        for(int i = 0; i < n-1;i++){
            int mi = i;
            for(int j=i +1; j< n; j++){
                if(marks[j] > marks[mi]){
                    mi = j;
                }
            }
            int temp = marks[i];
            marks[i] = marks[mi];
            marks[mi] = temp;
        
        }
        System.out.println("Sorted (Descending order): ");
        for(int mark : marks){
            System.out.print(mark + " ");
        }
        System.out.println();
        double median;
        if(n % 2 == 1){
            median = marks[n / 2];
        }
        else{
            median = (marks[n /2 - 1] + marks[n /  2]) / 2.0;
        }
        System.out.println("Median Score: " + median);
        System.out.println("Duplicate Marks:");
        boolean found = false;
        for(int i = 0; i < n; i++){
            boolean dupe = false;
            for(int j = i + 1; j < n; j++){
                if(marks[i] == marks[j]) {
                    dupe = true;
                    break;
                }
            }
            for(int k = 0; k < i; k++){
                if(marks[k] == marks[i]){
                    dupe = false;
                    break;
                }
            }
            if(dupe){
                System.out.println(marks[i] + " ");
                found = true;
            }
        }
        if(!found){
            System.out.println("None");
        }
        s.close();
    }
}