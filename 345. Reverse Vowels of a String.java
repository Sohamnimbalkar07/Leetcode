class Solution {
    public String reverseVowels(String s) {
        
        String v = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = s.length()-1;
        while(right > left)
        {
            CharSequence c1 = String.valueOf(s.charAt(left));
            CharSequence c2 = String.valueOf(s.charAt(right));
            
            if(v.contains(c1) && v.contains(c2))
            {
                char c3 = s.charAt(left);
                char c4 = s.charAt(right);
                sb.setCharAt(left,c4);
                sb.setCharAt(right,c3);
                right--;
                left++;
            }
            else
            {
            if(!v.contains(c1))
            {
                left++;
            }
            if(!v.contains(c2))
            {
                right--;
            }
            }
        }

        return sb.toString();

    }
}