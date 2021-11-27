#include<stdio.h>
#include<conio.h>
int main(){
    int a[3][3],i,j,b[9],k=0;
    printf("Enter Elements for 2D Array.......");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\nEnter Element a[%d][%d] : ",i,j);
            scanf("%d",&a[i][j]);
        }
    }
    getch();
    printf("\nThe Elements of 2D Array are....\n");
    getch();
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("a[%d][%d] = %d\t",i,j,a[i][j]);
            getch();
        }
    }
    printf("\nCopying into 1D Array.....");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            b[k]=a[i][j];
            k++;
        }
    }
    getch();
    printf("\nThe Elements of 1D Array are....\n");
    getch();
    for(k=0;k<9;k++){
        printf("b[%d] = %d\t",k,b[k]);
        getch();
    }
    return 0;
}