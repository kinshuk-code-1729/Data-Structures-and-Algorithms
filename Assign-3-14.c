// Program to check the  3 x 3 matrix is symmetrical or not
#include<stdio.h>
#include<conio.h>
int main(){
int x[3][3],y[3][3],i,j,chk=1;
printf("Enter The Elements for 3 X 3 Matrix");
getch();
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        printf("\nEnter Element x[%d][%d] : ",i,j);
        scanf("%d",&x[i][j]);
    }
}
// Transpose of matrix 'x'
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        y[j][i]=x[i][j];
    }
}
// Check for equivalence
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        if(x[i][j]!=y[i][j]){
            chk++;
            break;
        }
    }
}
if(chk==1) printf("\nIt's a symmetric matrix..");
else printf("\nIt's not a symmetric matrix..");
return 0;
}