<<<<<<< HEAD
class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) 
        {
            return 0;
        }
        
        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i - 1]) 
            {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
=======
class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) 
        {
            return 0;
        }
        
        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i - 1]) 
            {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
>>>>>>> d01d636a86ee4c8f6902a6c21cd8cc1f81b4cb00
}