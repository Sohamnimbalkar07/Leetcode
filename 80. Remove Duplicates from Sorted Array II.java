class Solution {
    public int removeDuplicates(int[] nums) {

        // int j = 0;
        // int k =1;
        // for(int i = 1; i< nums.length ;i++)
        // {
        //      if(nums[i] == nums[i-1] && j != 2)
        //      {    
        //          nums[k] = nums[i];
        //          k++;
        //          j=2;
        //      }
        //      if(nums[i] != nums[i-1])
        //      {
        //          nums[k] = nums[i];
        //          k++;
        //          j = 0;
        //      }

        // }

        // return k;

        if (nums.length <= 2) 
        {
           return nums.length;
        }

        int index = 2;

        for (int i = 2; i < nums.length; i++) 
        {
            if (nums[i] != nums[index - 2]) 
            {
               nums[index] = nums[i];
               index++;
            }
        }

        return index;
        
    }
}