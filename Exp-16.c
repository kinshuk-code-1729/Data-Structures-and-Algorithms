// Program to implement Bubble Sorting Technique into an Array
#include<stdio.h>
int main(){
    int a[]={76,35,55,64,27},i,j,temp,n=(sizeof(a)/sizeof(int));
    printf("Intially the Array Elements Are :");
    for(i=0;i<n;i++){
        printf("\t%d",a[i]);
    }
    printf("\nSorting the Elements in ascending order.....");
    for(i=0;i<(n-1);i++){
        for(j=0;j<(n-i-1);j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    printf("\nSorted Array is :");
    for(i=0;i<n;i++){
        printf("\t%d",a[i]);
    }
 return 0;
}
