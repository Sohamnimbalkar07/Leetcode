class Solution {
    
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int length = flowerbed.length;
        
        Boolean result = false;

        for(int i = 0 ; i < length  && n > 0; i++ )
        {
            
            if(flowerbed[i] == 0)
            {
               int prev = (i == 0) ? 0 : flowerbed[i-1];
               int next = (i == length - 1) ? 0 : flowerbed[i+1];

               if(prev == 0 && next == 0)
               {
                   flowerbed[i] = 1;
                   n--;
               }
            }
        }

        if(n == 0 )
        {
            result = true;
        }

        return result;
    }
}