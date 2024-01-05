class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);

        int result = 0;

        for(int i = 0; i< citations.length ; i++)
        {
            if(citations[i] >= citations.length -i)
            {
                result = Math.max(result, citations.length -i);
            }
        }

        return result;
    }
}