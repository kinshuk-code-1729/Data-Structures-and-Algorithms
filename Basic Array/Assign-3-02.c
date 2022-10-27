// Program to accept 5 number in any array and print in reverse order
#include<stdio.h>
int main(){
    int x[5],i;
    for(i=0;i<5;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",&x[i]);
    }
    printf("\nThe Elements of the array in reverse order are : ");
    for(i=4;i>=0;i--){
        printf("%d\t",x[i]);
    }
    return 0;
}