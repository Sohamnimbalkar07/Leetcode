class Solution {

    public int lengthOfLongestSubstring(String s)
    {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length();i++)
        {
            int index = sb.indexOf(String.valueOf(s.charAt(i)));
            
            if( index == -1)
            {
                sb.append(s.charAt(i));
                count = Math.max(count, sb.length());
            }
            else
            {
                sb.delete(0, index + 1);
                sb.append(s.charAt(i));
            }
        }

        return count;
    }
}