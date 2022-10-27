// Program to accept numbers as 3 x 3 x 3 ( three / multidimensional matrix ) array and print it
#include<stdio.h>
#include<conio.h>
int main(){
    int arr[3][3][3],i,j,k;
    printf("Enter Elements for 3D Array.......");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            for(k=0;k<3;k++){
                printf("\nEnter Element arr[%d][%d][%d] : ",i,j,k);
                scanf("%d",&arr[i][j][k]);
            }
        }
    }
    getch();
    printf("\nThe Elements of 3D Array are....\n");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            for(k=0;k<3;k++){
                printf("%d ",arr[i][j][k]);
                if(k==2) printf("\t");
            }
            if(j==2) printf("\n");
        }
    }
return 0;
}