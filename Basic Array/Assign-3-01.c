// Program to accept 5 number in any array and print it
#include<stdio.h>
int main(){
    int x[5],i;
    for(i=0;i<5;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",&x[i]);
    }
    printf("\nThe Elements of the array are : ");
    for(i=0;i<5;i++){
        printf("%d\t",x[i]);
    }
    return 0;
}