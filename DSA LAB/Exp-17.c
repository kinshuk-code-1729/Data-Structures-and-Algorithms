// Program to implement Selection Sorting Technique into an Array
#include<stdio.h>
#include<conio.h>
int main(){
    int a[]={4,7,1,3,9,22,15},i,temp,j,min,n=(sizeof(a)/sizeof(int));
    printf("Before Sorting Array Elements are......\n");
    getch();
    for(i=0;i<n;i++){
        printf("%d\t",a[i]);
    }
    for(i=0;i<n-1;i++){
        min=i;
        for(j=i+1;j<n;j++){
            if(a[j]<a[min]);
            min=j;
        }
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
    getch();
    printf("\nAfter Sorting Array Elements are......\n");
    getch();
    for(i=0;i<n;i++) printf("%d\t",a[i]);
    return 0;
}