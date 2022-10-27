// Program to accept 10 number in array and find the maximum and minimum number
#include<stdio.h>
int main(){
    int a[10],i,max,min;
    for(i=0;i<10;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",&a[i]);
    }
    max=a[0];
    min=a[0];
    for(i=0;i<10;i++){
      if(a[i]>max){
        max=a[i];
      }
      if(a[i]<min){
        min=a[i];
      }
    }
    printf("Max = %d\tMin = %d",max,min);
    return 0;
}