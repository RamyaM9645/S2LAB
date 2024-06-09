import java.util.*;

public class matrix_add {
    public static void main(String args[]) {

        // input diamensions
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row: ");
        int row = sc.nextInt();
        System.out.println("enter the number of column: ");
        int column = sc.nextInt();

        // imitialize matrix
        int matrix1[][] = new int[row][column];
        int matrix2[][] = new int[row][column];
        int matrixadd[][] = new int[row][column];

        // read matrix1
        System.out.println("enter matrix1 elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // read matrix2
        System.out.println("enter matrix2 elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // add
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixadd[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // display
        System.out.println("resultant matrix elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(matrixadd[i][j]);
            }
        }

    }
}