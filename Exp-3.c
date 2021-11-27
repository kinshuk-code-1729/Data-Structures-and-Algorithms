// Program for printing the sum of numbers using while
#include<stdio.h>
int main(){
    int i=1,s=0,n;
    printf("Enter the last Natural no. upto which you want to sum : ");
    scanf("%d",&n);
    while(i<=n){
        s+=i;
        i++;
    }
    printf("\nThe Sum upto %d is %d",n,s);
    return 0;
}