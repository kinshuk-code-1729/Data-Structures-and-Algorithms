class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int i = 0, j = 0, k = 0;
        int N = mat.length;
        int[] res = new int[N * N];
        int flag = 1;
        while(k < N * N){
            if(flag == 1){
                while(i >= 0 && j < N){
                    res[k] = mat[i][j];
                    k++;
                    if(j == N - 1){
                        i++;
                        break;
                    }
                    else if(i == 0){
                        j++;
                        break;
                    }
                    i--;
                    j++;
                }
                flag = 0;
            }
            else{
                while(i < N && j >= 0){
                    res[k] = mat[i][j];
                    k++;
                    if(i == N - 1){
                        j++;
                        break;
                    }
                    else if(j == 0){
                        i++;
                        break;
                    }
                    i++;
                    j--;
                }
                flag = 1;
            }
        }
        return res;
    }
}
