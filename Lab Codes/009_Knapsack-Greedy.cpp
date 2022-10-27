// Wap to implement fractional knapsack problem. 
#include<iostream> 
using namespace std; 
int main(){
    int w[]={4,7,6,8},p[]={10,5,20,3},m,profit,i,n;
    n=4; m=20; profit=0;
    for(i=0;i<n;i++){
        if(m>0 &&w[i]<=m){
            m=m-w[i];
            profit=profit+p[i];
        }
        else    break;
    }
    if(m>0){
        profit=profit+p[i]*(m/w[i]);
    }
    cout<<profit;
    return 0;
}