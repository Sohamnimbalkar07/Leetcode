class Solution {
    public boolean isAnagram(String s, String t) {
        
        s = s.toLowerCase().replaceAll("\\s","");
        t = t.toLowerCase().replaceAll("\\s","");
        char[] str = s.toCharArray();
        char[] str1 = t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(str1);
        return Arrays.equals(str,str1);
    }
}