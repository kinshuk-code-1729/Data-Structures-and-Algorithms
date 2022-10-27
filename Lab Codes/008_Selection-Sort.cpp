// Wap to implement Selection Sort 
#include<iostream> 
using namespace std; 
void selection_sort(int a[],int n){ 
    int minidx,temp;
    for(int i=0;i<n-1;i++){
        minidx=i;
        for(int j=i;j<n;j++){
            if(a[j]<a[minidx])  minidx=j;
        }
        if(minidx!=i){
            temp=a[minidx];
            a[minidx]=a[i];
            a[i]=temp;
        }
    } 
} 
int main(){
    int a[]={3,2,10,5,9,44,22,6};
    selection_sort(a,sizeof(a)/sizeof(int));
    for(int i=0;i<8;i++)    cout<<a[i]<<"\t";
    return 0; 
}