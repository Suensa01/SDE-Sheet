class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            int s=0,e=matrix.length-1;
            while(s<e){
                int temp=matrix[i][e];
                matrix[i][e]=matrix[i][s];
                matrix[i][s]=temp;
                s++;
                e--;
                }
        }
        
    }
}