class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // code here
        int[] minLeft = new int[n];
        int[] maxRight = new int[n];
        minLeft[0] = a[0];
        maxRight[n - 1] = a[n - 1];
        
        for(int i = 1; i < n; i++){
            minLeft[i] = Math.min(minLeft[i - 1], a[i]);
        }
        
        for(int i = n - 2; i >= 0; i--){
            maxRight[i] = Math.max(maxRight[i + 1], a[i]);
        }
        
        int maxDiff = -1;
        int i = 0, j = 0;
        
        while(i < n && j < n){
            if(minLeft[i] <= maxRight[j]){
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            }
            else{
                i++;
            }
        }
        
        return maxDiff;
    }
}
