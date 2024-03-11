//User function Template for Java

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int row1 = 0, col1 = 0, row2 = n - 1, col2 = n - 1;
        int count = 0;
        while(row1 < n && row2 >= 0){
            int sum = mat1[row1][col1] + mat2[row2][col2];
            if(sum == x){
                count += 1;
                col1++;
                col2--;
            }
            if(sum < x){
                col1++;
            }
            if(sum > x){
                col2--;
            }
            if(col1 == n){
                col1 = 0;
                row1++;
            }
            if(col2 == -1){
                col2 = n - 1;
                row2--;
            }
        }
        return count;
    }
}
