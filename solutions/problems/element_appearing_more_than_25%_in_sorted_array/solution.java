class Solution {
    public int bin_find1(int arr[], int val) {
		// to find the lower bound
        int l = 0, r = arr.length - 1;
        int ans = -1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(arr[mid] >= val) {
                ans = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return ans;
    }
    public boolean valid(int arr[], int ind) {
        int n = arr.length;
        int start = bin_find1(arr, arr[ind]);
        if(arr[start + (n / 4)] == arr[ind]) return true;
        return false;
    }
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int first = n / 4;
        int second = n / 2;
        int third = 3 * n / 4;
        
        if(valid(arr, first)) return arr[first];
        else if(valid(arr, second)) return arr[second];
        else if(valid(arr, third)) return arr[third];
        return -1;
    }
}