// Program to accept 10 number in array and find the minimum number
#include<stdio.h>
int main(){
    int a[10],i,min=a[0];
    for(i=0;i<10;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",&a[i]);
    }
    for(i=0;i<10;i++){
      if(a[i]<min) min=a[i];
    }
    printf("MINIMUM ELEMENT is %d",min);
    return 0;
}