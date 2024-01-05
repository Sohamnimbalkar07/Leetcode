class Solution {
    public int lengthOfLastWord(String s) {
        
        // String arr[]  = s.split("\\ ");
        // String a= arr[arr.length-1];
        // return a.length();

        String trimstring = s.trim();

        int i = trimstring.lastIndexOf(' ');

        String lastword = (i == -1) ? trimstring : trimstring.substring(i+1);

        return lastword.length(); 
    }
}