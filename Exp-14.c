// Program to implement Linear Search
#include<stdio.h>
#include<conio.h>
int main(){
    int a[]={95,68,88,35,53,46},s=(sizeof(a)/sizeof(int)),i,count=0,search;
    printf("\nEnter the Element You Want to Search : ");
    scanf("%d",&search);
    for(i=0;i<s;i++){
        if (a[i]==search){
            count++;
            break;
        }
    }
    if(count==1) printf("\nElement Found At Index %d and Position %d",i,i+1);
    else printf("\nElement Not Found in the Array");
 return 0;
}