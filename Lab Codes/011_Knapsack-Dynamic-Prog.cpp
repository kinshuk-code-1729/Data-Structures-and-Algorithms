// Wap to implement 0/1 knapsack Problem using Dynamic programing. 
#include<iostream> 
using namespace std; 
int main(){ 
    int p[4]={0,1,3,5},w[4]={0,2,1,4},m=6,n=3,k[4][7],i; 
    for(i=0;i<=n;i++){
        for(int w=0;w<=m;w++){
            if(i==0 || w==0)
            k[i][w]=0; 
            else if (k[i][w]== m(k[i-1][w],k[i-1][w-w[i]+p[i]]);
            else k[i][w]=k[i-1][w];
        }
    }
    cout<<"maximum profit = "<<k[n][w]; 
}
