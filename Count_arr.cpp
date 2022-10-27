// Given an array A, find the count of all elements that appear in it.
// Applying Brute Force
#include<bits/stdc++.h>
using namespace std;
int main(){
    int A[] = {3, 1, 3, 3, 1, 77, 44, 1, 1, 5, 2, 2, 15};
    int n = sizeof(A) / sizeof(A[0]);
    for (int i = 0; i < n; i++){
        if (A[i] == -1) continue;
        int count = 1; // Initialising variable count to 1 , since A[i] is occuring atleast once .
 
        for (int j = i + 1; j < n; j++){
            if (A[i] == A[j]){ // If A[i] is found again in the array
                A[j] = -1; // Making A[j] equal to -1 so that we dont count it twice
                count++;   // increasing count of A[i] by 1
            }
        } 
        cout << A[i] << " occurs " << count << " times" << endl;
    }
    return 0;
}
