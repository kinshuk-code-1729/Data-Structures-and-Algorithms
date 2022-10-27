// Wap to sort element using Heap Sort. 
#include<iostream> 
using namespace std; 
void heapify(int a[],int n,int i){
    int largest=i,temp;
    int l=2*i+1,r=2*i+2;
    if(l<n && a[l]>a[i]) largest=l; 
    if(r<n && a[r]>a[largest]) largest=r; 
    if(largest!=i){
        temp=a[i];
        a[i]=a[largest];
        a[largest]=temp;
        heapify(a,n,largest);
    }
} 
void heap_sort(int a[],int n){
    int i,temp;
    for(i=n/2-1;i>=0;i--)  heapify(a,n,i);
    for(i=n-1;i>0;i--){
        temp=a[0];
        a[0]=a[i];
        a[i]=temp; 
        heapify(a,i,0);
    } 
} 
int main(){
    int a[]={3,2,10,5},i;
    heap_sort(a,sizeof(a)/sizeof(int));
    for(int i=0;i<4;i++);
    cout<<a[i]<<"\t"; 
    return 0; 
}