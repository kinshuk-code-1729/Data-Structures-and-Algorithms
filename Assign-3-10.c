// Program to accept 9 numbers in 3 x 3 array, and display the sum of its each row and column
#include<stdio.h>
#include<conio.h>
int main(){
    int x[3][3],i,j,col_sum=0,row_sum=0;
    printf("Enter The Elements for 3 X 3 Matrix");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\nEnter Element x[%d][%d] : ",i,j);
            scanf("%d",&x[i][j]);
        }
    }
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            row_sum+=x[i][j];
        }
        printf("\nSum of row %d = %d",i+1,row_sum);
        getch();
        row_sum=0; 
    }
    for(j=0;j<3;j++){
        for(i=0;i<3;i++){
            col_sum+=x[i][j];
        }
        printf("\nSum of column %d = %d",j+1,col_sum);
        getch();
        col_sum=0;
    }
return 0;
}