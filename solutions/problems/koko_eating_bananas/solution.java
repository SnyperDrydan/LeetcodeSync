class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Integer.MIN_VALUE;

        for(int i: piles)
            r = Math.max(i, r);

        int min = r;

        while(l<r) {
            int m = (l+r)/2;

            int hours = 0;
            for(int i: piles)
                hours+= Math.ceil((double) i/m);
            
            if(hours <= h) {
                min = Math.min(hours, min);
                r = m;
            } else {
                l = m+1;
            }
        }

        return r;
    }
}
