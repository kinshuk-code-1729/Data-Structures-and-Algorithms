// Program to accept 9 numbers in 3 x 3 array ( 2 dimension array )
#include<stdio.h>
#include<conio.h>
int main(){
    int x[3][3],i,j;
    printf("Enter The Elements for 3 X 3 Matrix");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\nEnter Element x[%d][%d] : ",i,j);
            scanf("%d",&x[i][j]);
        }
    }
    getch();
    printf("\nThe elements of the array are.....\n");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%d\t",x[i][j]);
            if(j==2) printf("\n");
        }
    }
    return 0;
}