// Program to get 3 x 3 matrix addition of two matrices
#include<stdio.h>
#include<conio.h>
int main(){
int x[3][3],y[3][3],z[3][3],i,j;
printf("Enter The Elements for Matrix 1");
getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\nEnter Element x[%d][%d] : ",i,j);
            scanf("%d",&x[i][j]);
        }
    }
printf("\nEnter The Elements for Matrix 2");
getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\nEnter Element y[%d][%d] : ",i,j);
            scanf("%d",&y[i][j]);
        }
    }
getch();
printf("\nThe 1st matrix is.....\n");
getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%d\t",x[i][j]);
            if(j==2) printf("\n");
        }
    }
getch();
printf("\nThe 2nd matrix is.....\n");
getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%d\t",y[i][j]);
            if(j==2) printf("\n");
        }
    }
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            z[i][j]=x[i][j]+y[i][j];        }
    }
getch();
printf("\nOn adding the given matrices the new resultant matrix is......\n");
getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%d\t",z[i][j]);
            if(j==2) printf("\n");
        }
    }
return 0;
}