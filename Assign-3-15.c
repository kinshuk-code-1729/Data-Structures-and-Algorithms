// Program to check the  3 x 3 matrix is identical or not
#include<stdio.h>
#include<conio.h>
int main(){
int x[3][3],y[3][3],i,j,chk=1;
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
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        if(x[i][j]!=y[i][j]){
            chk++;
            break;
        }
    }
}
if(chk==1) printf("\nBoth the Matrices are identical...");
else printf("\nBoth the Matrices are not identical...");
return 0;
}