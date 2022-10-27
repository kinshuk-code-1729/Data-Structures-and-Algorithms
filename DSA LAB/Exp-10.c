// Program to Copy the Contents from one Array to Another
#include<stdio.h>
#include<conio.h>
int main(){
    int a[10],b[10],i;
    printf("Enter the elements of the array below");
    getch();
    for(i=1;i<=10;i++){
        printf("\nEnter Element %d : ",i);
        scanf("%d",&a[i]);
    }
    printf("\nThe Elements of the 1st array are : ");
    for(i=1;i<=10;i++){
        printf(" %d",a[i]);
    }
    getch();
    printf("\nCopying the elements of 1st array into 2nd array");
    getch();
    printf("\nThe Elements of the 2nd array are : ");
    for(i=1;i<=10;i++){
        b[i]=a[i];
        printf(" %d",b[i]);
    }
return 0;
}