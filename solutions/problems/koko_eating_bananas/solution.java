class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1;
        for(int i: piles)
            r = Math.max(r, i);
        int res = r;

        while(l<r) {
            int m = (l+r)/2;
            int hours = 0;
            for(int i : piles)
                hours += Math.ceil((double) i/m);
            if(hours<=h) {
                r = m;
            } else {
                l = m+1;
            }

        }
        return r;
    }
}