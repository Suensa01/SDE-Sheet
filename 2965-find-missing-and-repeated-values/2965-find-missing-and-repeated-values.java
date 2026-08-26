class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n=grid.length;
        long N=n*n;

        long Sn=N*(N+1) / 2;
        long S2n=N*(N+1)*(2*N+1) / 6;

        long S=0, S2=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                long val = grid[i][j];
                S+=val;
                S2+=val*val;
            }
        }

        long diff = S-Sn;
        long sqdiff = S2-S2n;
        
        sqdiff =sqdiff/diff;
        
        long x = (diff+sqdiff) / 2;
        long y = x - diff; 

        return new int[] {(int)x,(int)y};
        
    }
}