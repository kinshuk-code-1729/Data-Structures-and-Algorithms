// Given two arrays A and B, find all the common elements between them.
#include<bits/stdc++.h>
using namespace std;
int main(){
    int A[5] = {1,2,3,4,5};
    int B[7] = {4,5,6,7,8,9,10};
    int n = 5,m = 7;
    cout<<"Common Elements : ";
    for(int i = 0;i < n;i++){
        for(int j = 0;j < m;j++){
            if(A[i] == B[j]){
                cout<<A[i]<<" ";
            }
        }
    }
    return 0;
}