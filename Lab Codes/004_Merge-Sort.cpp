// Wap to implement Merge Sort
#include<iostream> 
using namespace std; 
void merge(int arr[], int l, int m, int r) 
{ 
 int i, j, k; 
 int n1 = m - l + 1; 
 int n2 = r - m; 
 
 /* create temp arrays */ 
 int L[n1], R[n2]; 
 
 /* Copy data to temp arrays L[] and R[] */ 
 for (i = 0; i < n1; i++) 
 L[i] = arr[l + i]; 
 for (j = 0; j < n2; j++) 
 R[j] = arr[m + 1 + j]; 
 
 /* Merge the temp arrays back into arr[l..r]*/ 
 i = 0; // Initial index of first subarray 
 j = 0; // Initial index of second subarray 
 k = l; // Initial index of merged subarray 
 while (i < n1 && j < n2) { 
 if (L[i] <= R[j]) { 
 arr[k] = L[i]; 
 i++; 
 } 
 else { 
 arr[k] = R[j]; 
 j++; 
 } 
 k++; 
 } 
 while (i < n1) { 
 arr[k] = L[i]; 
 i++; 
 k++; 
 } 
 while (j < n2) { 
 arr[k] = R[j]; 
 j++; 
 k++; 
 } 
} 
 void mergeSort(int arr[], int l, int r) 
{ 
 if (l < r) { 
 int m = l + (r - l) / 2; 
 mergeSort(arr, l, m); 
 mergeSort(arr, m + 1, r); 
 
 merge(arr, l, m, r); 
 } 
} 
int main() 
{ 
 int a[]={33,2,110,50,7,11,9}; 
 mergeSort(a,0,sizeof(a)/sizeof(int)); 
 for(int i=0;i<6;i++) 
 cout<<a[i]<<"\t"; 
 return 0; 
}