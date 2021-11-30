// Program to implement Binary Searching Technique into an Array
#include<stdio.h>
int main(){
    int a[]={76,35,55,64,27},i,j,temp;
    printf("Intially the Array Elements Are :");
    for(i=0;i<5;i++){
        printf("\t%d",a[i]);
    }
    printf("\nSorting the Elements in ascending order.....");
    for(i=0;i<4;i++){
        for(j=0;j<(4-i);j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    printf("\nSorted Array is :");
    for(i=0;i<5;i++){
        printf("\t%d",a[i]);
    }
 return 0;
}