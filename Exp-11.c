// Program to find EVEN & ODD elements of an array
#include<stdio.h>
#include<conio.h>
int main(){
    int x[10],j;
    printf("Enter the elements of the array below");
    getch();
    for(j=0;j<10;j++){
        printf("\nEnter Element %d : ",j+1);
        scanf("%d",&x[j]);
    }
    printf("\nEven Elements are : ");
    for(j=0;j<10;j++){
        if(x[j]%2==0) printf("\t%d",x[j]);
    }
    printf("\nOdd Elements are : ");
    for(j=0;j<10;j++){
        if(x[j]%2!=0) printf("\t%d",x[j]);
    }
    return 0;
}