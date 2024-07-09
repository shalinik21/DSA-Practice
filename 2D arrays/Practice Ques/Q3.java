public class Q3 {
    public static void Transpose(int matrix[][]) {
        int transMatrix[][]=new int[3][2];
        
        for (int i = 0; i <transMatrix.length; i++) {
            for (int j = 0; j <transMatrix[0].length; j++) {
                transMatrix[i][j]=matrix[j][i];
            }
            
        }
        for (int i = 0; i <transMatrix.length; i++) {
            for (int j = 0; j <transMatrix[0].length; j++) {
                System.out.print(transMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 11, 12, 13 },
                { 21, 22, 23 }

        };

        Transpose(matrix);
    }

}
