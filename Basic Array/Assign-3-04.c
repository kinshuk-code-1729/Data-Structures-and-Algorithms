// Program to accept 5 numbers in any array, another five number in second array and store the sum in third array
#include <stdio.h>
int main(){
  int x[5],y[5],z[5],k;
  printf("For 1st array");
  for(k=0;k<5;k++){
   printf("\nEnter element %d : ",k+1) ; scanf("%d",&x[k]);
  }
  printf("\nFor 2nd array");
  for(k=0;k<5;k++){
      printf("\nEnter element %d : ",k+1) ; scanf("%d",&y[k]);
  }
 printf("\nStoring the sum of elements of both the arrays in the third array");
 for(k=0;k<5;k++) { 
     z[k]=x[k]+y[k]; 
     }
 printf("\nThe Elements of the third array are : ");
 for(k=0;k<5;k++){ 
     printf("%d ",z[k]);
     }
 return 0;
 }