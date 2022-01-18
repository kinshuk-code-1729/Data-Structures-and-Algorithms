// Program to get 3 x 3 matrix transpose
#include<stdio.h>
#include<conio.h>
int main(){
    int x[3][3],y[3][3],i,j;
    printf("Enter The Elements for 3 X 3 Matrix");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\nEnter Element x[%d][%d] : ",i,j);
            scanf("%d",&x[i][j]);
        }
    }
    getch();
    printf("\nThe Matrix elements are......\n");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%d\t",x[i][j]);
            if(j==2) printf("\n");
        }
    }
// Loop for generating TRANSPOSE MATRIX of given matrix
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            y[j][i]=x[i][j];
        }
    }
    getch();
    printf("\nThe transpose of given matrix is.....\n");
    getch();
        for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%d\t",y[i][j]);
            if(j==2) printf("\n");
        }
    }
return 0;
}