class Solution {
    public int majorityElement(int[] nums) {

        int cnt=0;
        int elm=0;

        for(int i=0;i<nums.length;i++)
        {
            if (cnt==0)
            {
                cnt=1;
                elm=nums[i];
            }
            else if(elm==nums[i])
            {
                cnt+=1;
            }
            else{
                cnt-=1;
            }
        }

        int cnt1=0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i] == elm) cnt1++;
        }
        if (cnt1>nums.length/2)
        {
            return elm;
        }

        
        return -1;
    }
}