class Solution {
    public int totalMoney(int n) {
        int remaining = n%7;
        int weeks = n/7;
        int sumOfWeeks=(int)(((double)(weeks) / 2) * (2*28 + (double)(weeks-1) * 7));
        sumOfWeeks+=(int)(((double)(remaining) / 2)*(2*(1 + weeks) + (double)(remaining - 1)));
        return sumOfWeeks;
    }
}