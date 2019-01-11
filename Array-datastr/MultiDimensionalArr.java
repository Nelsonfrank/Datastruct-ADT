class MultiDimensionalArr{


    public static void main(String args[]){

        int [][]matrix = new int[10][10];


        for(int i=0; i< matrix.length; i++){
            for(int j = 0; j<matrix[i].length;j++){
                matrix[i][j] = (int)(Math.random() *13); 

                System.out.print(matrix[i][j]);
            }

            
        }

    }
}