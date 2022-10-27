// Program to accept 10 number in array and find the second highest number
#include<stdio.h>
int main(){
    int a[10],i,max1=0,max2=0;
    for(i=0;i<10;i++){
        printf("\nEnter Element %d : ",i+1);
        scanf("%d",&a[i]);
    }
    for(i=0;i<10;i++){
        if(a[i]>max1){
            max2=max1;
            max1=a[i];
        }
        else if(a[i]<max1){
            if(a[i]>max2){
                max2=a[i];
            }
        }
    }
    printf("\n1st MAX = %d\t2nd MAX = %d",max1,max2);
    return 0;
}