public class Sorted2Darray {

    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==key){
                System.out.println(key +" is found at "+"("+row+", "+col+")");
                return true;
            }
            else{
                if(key>matrix[row][col]){
                    row++;
                }
                else{
                    col--;
                }
            }
        }
        System.out.println("Key not found");

        return false;
    }
    public static void main(String args[]){
        int key=10;
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        staircaseSearch(matrix, key);
    }
    
}
