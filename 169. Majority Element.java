class Solution {
    public int majorityElement(int[] nums) {
        
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i = 0; i< nums.length ;i++)
        // {
        //     map.put(nums[i], map.getOrDefault(nums[i],0) +1);
        // }

        // for(Map.Entry<Integer,Integer> entry : map.entrySet())
        // {
        //     if(entry.getValue() > nums.length/2)
        //     {
        //         return entry.getKey();
        //     }
        // }

        // return -1;

        int count = 0;
        int num = 0 ; 
        for(int i = 0; i< nums.length ; i++)
        {
            if(count  == 0)
            {
                num = nums[i];
                count++;
            }
            else if(nums[i] == num)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        count = 0;
        for(int i = 0; i< nums.length ; i++)
        {
            if(nums[i]== num)
            {
               count++;
            }
        }

        if(count > (nums.length/2))
        {
            return num;
        }

        return -1;
    }
}