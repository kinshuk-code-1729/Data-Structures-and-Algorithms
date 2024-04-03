// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        int low = 0, high = n - 1;
        int i = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(k == arr[mid]){
                i = mid;
                break;
            }
            
            if(k > arr[mid]){
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        
        return i;
    }
}
