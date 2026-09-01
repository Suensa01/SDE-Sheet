class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;


        int [][] nindex = new int [n][2];

        for(int i=0;i<n;i++)
        {
                nindex[i][0]= nums[i];
                nindex[i][1]= i;
        }
        Arrays.sort(nindex,(a,b) -> Integer.compare(a[0],b[0]));

        while(l<r)
        {
            int sum=nindex[l][0]+nindex[r][0];
            if(target==sum) return new int[]{nindex[l][1],nindex[r][1]};
            else if(target < sum) r--;
            else l++;
        }

        return new int[]{-1,-1};
    }
}