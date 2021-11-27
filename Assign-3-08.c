// Program to accept 10 number in array and to the search specific number, entered by user
#include<stdio.h>
int main(){
    int a[10],i,n;
    for(i=0;i<10;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",&a[i]);
    }
    printf("\nEnter any element to be searched : ");
    scanf("%d",&n);
  for(i=0;i<10;i++){
      if(n==a[i]){
          printf("%d found at index %d and position %d",n,i,i+1);
          break;
          }
    }
    if(n!=a[i])
     { printf("%d is not present in array",n);
     }
return 0;   
}