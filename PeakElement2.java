// Optimised Approach using Binary Search
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       int low = 0;
       int high = n - 1;
       
       while(low <= high){
           int mid = low + (high - low) / 2;
           
           if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])){
               return mid;
           }
           else if(arr[mid + 1] >= arr[mid]){
               low = mid + 1;
           }
           else{
               high = mid - 1;
           }
       }
       
       return -1;
    }
}
