class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            if (c1==0 && el2!=nums[i])
            {
                c1=1;
                el1=nums[i];
            }
            else if(c2==0 && el1!=nums[i])
            {
                c2=1;
                el2=nums[i];
            }
            else if (el1==nums[i]) c1++;
            else if (el2==nums[i]) c2++;
            else{
                c1--;
                c2--;
            }
        }

        List<Integer> res= new ArrayList<>();
        c1=0;
        c2=0;
        for(int i=0;i<n;i++)
        {
            if (nums[i]==el1) c1++;
            if (nums[i]==el2) c2++;
        }

        int mini=n/3+ 1;
        if(c1>=mini) res.add(el1);
        if(c2>=mini && el1!=el2) res.add(el2);

        return res;
    }
}