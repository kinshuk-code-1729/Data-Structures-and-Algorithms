// Program to implement Binary Search
#include<stdio.h>
#include<conio.h>
int main(){
    int a[]={19,38,46,57,68,83},low=0,high=6,mid,search,count=0,location;
    printf("\nEnter the Element You Want to Search : ");
    scanf("%d",&search);
    while(low<=high){
        mid=(low+high)/2;
        if(a[mid]==search){
            location=mid;
            count++;
            break;
        }
        if(a[mid]<search) low=mid+1;
        else high=mid-1;
    }
    if(count==1) printf("\nElement Found in Array at Index %d and Position %d",location,location+1);
    else printf("\nElement Not Found in the Array !!!!");
    return 0;
}