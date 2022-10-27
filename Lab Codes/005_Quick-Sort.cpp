// Wap to sort element using Quick sort 
#include<iostream> 
using namespace std; 
int partition(int a[],int low ,int high){
    int pivot=high; 
    int i=low-1; 
    for(int j=low;j<high;j++){
        if(a[j]<a[pivot]){
            i++;
            int t=a[j]; 
            a[j]=a[i]; 
            a[i]=t;
        }
    }
    i++;
    int t=a[i]; 
    a[i]=a[pivot]; 
    a[pivot]=t; 
    return i; 
} 
void quick_sort(int a[],int low ,int high){
    if(low<high){
        int pi=partition(a,low,high);
        quick_sort(a,low,pi-1); 
        quick_sort(a,pi+1,high);
    } 
} 
int main(){
    int a[]={31,22,110,51,4,3,8,9};
    quick_sort(a,0,sizeof(a)/sizeof(int));
    for(int i=0;i<8;i++)
    cout<<a[i]<<"\t";
    return 0;
}