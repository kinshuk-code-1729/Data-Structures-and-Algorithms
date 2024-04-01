/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static int k;
    public static int pairsViolatingBST(int n, Node root) {
        k = 0;
        int[] arr = new int[n];
        inorder(root, arr);
        
        return countInv(arr, 0, n - 1);
    }
    
    public static void inorder(Node root, int[] arr){
        if(root == null){
            return;
        }
        
        inorder(root.left, arr);
        arr[k] = root.data;
        k++;
        inorder(root.right, arr);
    }
    
    public static int countInv(int[] arr, int left, int right){
        int ans = 0;
    
        if(left < right){
            int mid = (left + right) / 2;
            // left sub-half inversions
            ans += countInv(arr, left, mid);
            // right sub-half inversions
            ans += countInv(arr, mid + 1, right);
            // remaining left or right inversions
            ans += mergeAndCount(arr, left, mid, right);
        }
    
        return ans;
    }
    
    public static int mergeAndCount(int[] arr, int left, int mid, int right){
        int N1 = mid - left + 1;
        int N2 = right - mid;
        int[] leftArr = new int[N1];
        int[] rightArr = new int[N2];

        for(int i = 0; i < N1; i++){
            leftArr[i] = arr[left + i];
        }
    
        for(int j = 0; j < N2; j++){
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left, count = 0;

        while(i < N1 && j < N2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
    
            else{
                arr[k] = rightArr[j];
                j++;
                k++;
                count += (N1 - i);
            }
        }

        while(i < N1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < N2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }

        return count;        
    }
}
