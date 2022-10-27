/* Program to print 5 elements of an array.
   Print the sum of the elements.
   Also print the elements in reverse order.
   Finally find the largest and smallest number of the array. 
*/
#include<stdio.h>
int main(){
    int a[5]={25,11,7,75,56},i,sum=0,max=a[0],min=a[0];
    printf("The elements of the array are : ");
    for(i=0;i<5;i++){
        printf("%d\t",a[i]);
    }
    /*for(i=0;i<5;i++){
        sum+=a[i];
    }
    printf("\nThe sum of the elements is %d",sum);*/
    printf("\nThe elements of the array in reverse order are : ");
    for(i=4;i>=0;i--){
        printf("%d\t",a[i]);
    }
    for(i=1;i<5;i++){
      if(a[i]>max) max=a[i];
    }
    for(i=1;i<5;i++){
      if(a[i]<min) min=a[i];
    }
    printf("\nThe Largest Element is %d and the Smallest Element is %d",max,min);
    return 0;
}