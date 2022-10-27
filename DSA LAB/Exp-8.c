// Program for generating Fibonacci series
#include<stdio.h>
int main(){
    int t1=0,t2=1,t3=0,lt,i;
    printf("Enter Last term : ");
    scanf("%d",&lt);
    printf("\nThe generated fibonacci series is : \n");
    for(i=1;i<=lt;i++){
        printf("%d\t",t3);
        t3=t1+t2;
        t1=t2;
        t2=t3;
    }
    return 0;
}