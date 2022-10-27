// Wap to Implement Linear Search
#include<iostream>
using namespace std;
int search(int arr[], int n, int x){
    int i;
    for(i = 0; i < n; i++){
    if (arr[i] == x) return i;
    }
    return -1;
}
int main(){
    int a[5],x,n = sizeof(a) / sizeof(int),result;
    cout<<"Enter Array Elements : ";
    for (int i = 0; i < 5; i++)
    {
        cin>>a[i];
    }
    cout<<endl<<"Enter Search Element : ";
    cin>>x;
    result = search(a, n, x);
    (result == -1)
    ? cout << "Element is not present in array"
    : cout << x <<" is present at index " << result;
    return 0;
}