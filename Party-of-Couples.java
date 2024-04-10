class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        Arrays.sort(arr);
        int i = 0;
        while(i < n){
            if(i == n - 1 && arr[i] != arr[i - 1]){
                return arr[i];
            }
            else if(arr[i] == arr[i + 1]){
                i += 2;
            }
            else if(arr[i] != arr[i + 1]){
                return arr[i];
            }
        }
        return 0;
    }
}
