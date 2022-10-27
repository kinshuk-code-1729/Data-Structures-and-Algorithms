// Program to accept 5 number in any array copy to another array
#include<stdio.h>
#include<conio.h>
int main(){
    int x[5],y[5],j;
    for(j=0;j<5;j++){
        printf("\nEnter Element %d : ",j+1);
        scanf("%d",&x[j]);
    }
    printf("\nThe Elements of the 1st array are : ");
    for(j=0;j<5;j++){
        printf("%d\t",x[j]);
    }
    printf("\nCopying the elements of 1st array into 2nd array");
    printf("\nThe Elements of the 2nd array are : ");
    for(j=0;j<5;j++){
        y[j]=x[j];
        printf("%d\t",y[j]);
    }
return 0;
}