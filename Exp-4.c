// Program to find the reverse of a number using while
#include<stdio.h>
int main(){
    int n,rev=0;
    printf("Enter Any Number : ");
    scanf("%d",&n);
    while(n!=0){
        rev=rev*10+n%10;
        n/=10;
    }
    printf("\nThe Reversed number is %d",rev);
    return 0;
}