// Program to swap 2 no.'s without using third variable using multiplication/division operations
#include<stdio.h>
int main(){
    int x,y;
    printf("Enter two numbers : ");
    scanf("%d%d",&x,&y);
    printf("\nValues before swapping");
    printf("\n1st value = %d\n2nd value = %d",x,y);
    x=x*y; y=x/y; x=x/y;
    printf("\nValues after swapping");
    printf("\n1st value = %d\n2nd value = %d",x,y);    
    return 0;
}