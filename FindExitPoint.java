

// User function Template for Java

class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here
        int i = 0, j = 0, dir = 1;
        
        while(i >= 0 && j >= 0 && i < n && j < m){
            if(matrix[i][j] == 1){
                matrix[i][j] = 0;
                dir = (dir % 4) + 1;
            }
            
            if(dir == 1){
                j++;
            }
            
            else if(dir == 2){
                i++;
            }
            
            else if(dir == 3){
                j--;
            }
            
            else{
                i--;
            }
        }
        
        if(dir == 1){
            j--;
        }
            
        else if(dir == 2){
            i--;
        }
            
        else if(dir == 3){
            j++;
        }
            
        else{
            i++;
        }
        
        return new int[] {i,j};
    }
}
