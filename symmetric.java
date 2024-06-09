import java.util.*;

class symmetric {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of row: ");
        int row = sc.nextInt();
        System.out.println("enter no of cols: ");
        int column = sc.nextInt();

        int matriix[][] = new int[row][column];
        System.out.println("enter the matrix elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matriix[i][j] = sc.nextInt();
            }
        }

        System.out.println("the matrix elements are.....  ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(matriix[i][j]);
            }
        }

        boolean issymmetric = true;
        if (row != column) {
            issymmetric = false;
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (matriix[i][j] != matriix[j][i]) {
                        issymmetric = false;
                        break;
                    }
                }
                if (!issymmetric) {
                    break;
                }
            }
        }
        if (issymmetric) {
            System.out.println("matrix is symmetric");
        } else {
            System.out.println("not symmetric");
        }
    }
}