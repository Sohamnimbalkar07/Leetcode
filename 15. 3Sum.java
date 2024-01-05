class Solution {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
    
    
    Arrays.sort(nums);
    for(int i = 0; i< nums.length; i++)
    {
        if( i == 0  || nums[i-1] != nums[i]  )
        {
            twosum(i+1,nums.length-1,nums,0 - nums[i]);
        }
    }


    return result;
}

void twosum(int i, int n, int[] nums,int k)
{
    int a = nums[i-1];
    while(i< n)
    {
    if(nums[i] + nums[n] > k)
    {
         n--;
    }
    else if(nums[i] + nums[n] < k)
    {
         i++;
    }
    else
    {
        List<Integer> list = new ArrayList<>();
            list.add(a);
            list.add(nums[i]);
            list.add(nums[n]);
            result.add(list);
        while(i< n && nums[i+1] == nums[i]) i++;
        while(i< n && nums[n - 1] == nums[n] ) n--;

        i++;
        n--;
    }
    }
}

}