// Program to find the largest of three numbers using If-Else
#include<stdio.h>
int main(){
  int x,y,z;
  printf("Enter three numbers : ");
  scanf("%d%d%d",&x,&y,&z);

  if (x>y){
      if (x>z) printf("%d is greatest among all three numbers",x);
      else printf("%d is greatest among all three numbers",z);
    }
  else {
      if(y>z) printf("%d is greatest among all three numbers",y);
      else printf("%d is greatest among all three numbers",z);
    }
 return 0;
}