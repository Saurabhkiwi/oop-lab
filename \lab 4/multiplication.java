import java.util.Scanner;

class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns for the first matrix: ");
        int rA = sc.nextInt();
        int cA = sc.nextInt();
        int[][] matA = new int[rA][cA];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rA; i++) {
            for (int j = 0; j < cA; j++) {
                matA[i][j] = sc.nextInt();
            }
        }        
        System.out.print("Enter the number of rows and columns for the second matrix: ");
        int rB = sc.nextInt();
        int cB = sc.nextInt();
        int[][] matB = new int[rB][cB];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rB; i++) {
            for (int j = 0; j < cB; j++) {
                matB[i][j] = sc.nextInt();
            }
        }
        if (rA == rB && cA == cB) {
            int[][] sumMat = new int[rA][cA];
            System.out.println("Sum of matrices:");
            for (int i = 0; i < rA; i++) {
                for (int j = 0; j < cA; j++) {
                    sumMat[i][j] = matA[i][j] + matB[i][j];
                    System.out.print(sumMat[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition not possible. Dimensions must be the same.");
        }
        if (cA == rB) {
            int[][] productMat = new int[rA][cB];
            System.out.println("Product of matrices:");

           
            for (int i = 0; i < rA; i++) { 
                for (int j = 0; j < cB; j++) { 
                    productMat[i][j] = 0; 
                    for (int k = 0; k < cA; k++) { 
                        productMat[i][j] += matA[i][k] * matB[k][j]; 
                    }
                    System.out.print(productMat[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication not possible. Number of columns in Matrix A must equal number of rows in Matrix B.");
        }
    }
}