#include<stdio.h>
int main(){
    int x[5],y[5],i,*p,*q;
    p=x;q=y;
    printf("Enter the Elements of First Array : ");
    for(i=0;i<5;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",p+i);
    }      
    printf("Enter the Elements of Second Array : ");
    for(i=0;i<5;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",q+i);
    }   
    for(i=0;i<5;i++){
        *(p+i)=(*(p+i))+(*(q+i));
        *(q+i)=(*(p+i))-(*(q+i));
        *(p+i)=(*(p+i))-(*(q+i));
    }
    printf("\nFirst Array :");
    for(i=0;i<5;i++){
        printf("\t%d",*p);
        p++;
    }
    printf("\nSecond Array :");
    for(i=0;i<5;i++){
        printf("\t%d",*q);
        q++;
    }
    return 0;
}