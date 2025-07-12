import java.util.Scanner;
public class Transpose_matrix{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int  m = i.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = i.nextInt();
        int[][] matrix = new int[m][n];
        int[][] transpose = new int[n][m];
        System.out.println("Enter the elements of matrix: ");
        for(int k = 0; k < m ; k++){
            for(int j = 0; j < n; j++){
                matrix[k][j] = i.nextInt();
            }
        }
        
        for(int k = 0; k < m;k++){
            for(int j= 0; j < n;j++){
                transpose[j][k] = matrix[k][j];
            }
        }

        System.out.println("\nOriginal Matrix: ");
        for(int k = 0; k < m; k++){
            for(int j = 0; j < n;j++){
                System.out.print(matrix[k][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose Matrix: ");
        for(int k = 0;k < n; k++){
            for(int j = 0; j < m; j++){
                System.out.print(transpose[k][j] + " ");
            }
            System.out.println();
        }
    }
}