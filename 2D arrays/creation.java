import java.util.*;

public class creation {

    // Searching
    public static boolean Searchkey(int matrix[][],int m,int n,int key) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }

    // find the maximum number

    public static int maxNum(int matrix[][],int m,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // displaying
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the key value");
        int key=sc.nextInt();

        System.out.println(Searchkey(matrix, m, n, key));

        System.out.println("The maximum value in the matrix is: "+maxNum(matrix, m, n));

    }
}