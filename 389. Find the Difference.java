class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] c1= s.toCharArray();
        char[] c2= t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        int i;
        int j=Math.min(c1.length,c2.length);

        for(i=0; i< j;i++)
        {
            if( c1[i] != c2[i])
            {
                return c2[i];
            }
        }

        return c2[i];


    }
}