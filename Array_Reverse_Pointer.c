#include<stdio.h>
int main(){
    int a[5],*p,i;
    p=a;
    printf("Enter the Elements of Array : ");
    for(i=0;i<5;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",p+i);
    }   
    p+=4;
    printf("\nThe Elements of array in reverse order are : ");
    for(i=0;i<5;i++){
        printf("\t%d",*p);
        p--;
    }
    return 0;
}