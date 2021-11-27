// Program to find the factorial of a number using for loop
#include<stdio.h>
int main(){
    int f=1,n,i;
    printf("Enter a Number : ");
    scanf("%d",&n);
    for(i=1;i<=n;i++) f*=i;
    printf("\n%d! = %d",n,f);
return 0;
}