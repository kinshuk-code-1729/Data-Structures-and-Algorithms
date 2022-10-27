// Wap to implement Bubble Sort. 
#include<iostream> 
using namespace std; 
void bubble_sort(int a[],int n){ 
    int temp; 
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
} 
int main(){
    int a[]={3,2,10,5,55,20,1,9};
    bubble_sort(a,sizeof(a)/sizeof(int)); 
    for(int i=0;i<4;i++) cout<<a[i]<<"\t"; 
    return 0;
 }