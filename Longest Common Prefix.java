class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String prefix = "";
        
        String first = strs[0];
        String last = strs[strs.length-1];

        for( int i = 0;i < last.length() && i < first.length();i++)
        {
          if( first.charAt(i) == last.charAt(i))
          {
              prefix = prefix + first.charAt(i);
          }
          else
          {
              break;
          }
        }
        
        return prefix;
    }
}