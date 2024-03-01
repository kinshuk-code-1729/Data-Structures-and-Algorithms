// Brute Force Approach

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       for(int i = 0; i < n; i++){
           if((i == 0 || arr[i] >= arr[i - 1]) && (i == n - 1 || arr[i] >= arr[i + 1])){
               return i;
           }
       }
       return -1;
    }
}
