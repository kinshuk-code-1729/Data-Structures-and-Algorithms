// User function Template for Java
class Solution {
    public void printArr(int n, int arr[]) {
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void setToZero(int n, int arr[]) {
        for(int i = 0; i < n; i++){
            arr[i] = 0;
        }
    }

    public void xor1ToN(int n, int arr[]) {
        for(int i = 0; i < n; i++){
            arr[i] ^= i;
        }
    }
}
