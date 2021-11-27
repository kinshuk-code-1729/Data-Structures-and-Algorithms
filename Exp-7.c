// Program for displaying Armstrong number
#include<stdio.h>
int main(){
    int sum=0,temp,num,rem;
    printf("Enter a number : ");
    scanf("%d",&num);
    temp=num;
    while(num>0)
    { rem=num%10;
      sum=sum+(rem*rem*rem);
      num=num/10;
    }
    if(sum==temp) printf("\n%d is an armstrong number",temp);
    else printf("\n%d is not an armstrong number",temp);
    return 0;
}