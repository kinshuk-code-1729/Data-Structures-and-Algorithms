// Program to perform the various Stack operations
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX 10
int choice,top=-1,stack[MAX];
char ch;
void push();
void pop();
void traverse();
int main(){
    do{
        printf("\nSTACK OPERATIONS....");
        printf("\n1.INSERTION");
        printf("\n2.DELETION");
        printf("\n3.DISPLAY");
        getch();
        printf("\nEnter Your Choice (1-3) : ");
        scanf("%d",&choice);
        switch(choice){
            case 1:push();
            break;
            case 2:pop();
            break;
            case 3:traverse();
            break;
            default:printf("\nINVALID CHOICE !!!!,Please Enter Valid Choice (1-3).....");
            getch();
        }
        fflush(stdin);
        printf("\nDo You Want To Continue......??? : ");
        ch=getche();
    }
    while((ch=='Y')||(ch=='y'));
 return 0;
}
void push(){
    int item;
    printf("\nEnter the Item You Want to Insert : ");
    scanf("%d",&item);
    if(top==MAX-1) printf("\nOVERFLOW !!!!,Stack is Full");
    else{
        top++;
        stack[top]=item;
        printf("\n%d inserted at the top of the stack",item);
    }
}
void pop(){
    int item;
    if(top==-1) printf("\nUNDERFLOW !!!!,Stack is Empty");
    else{
        item=stack[top];
        printf("\nThe Deleted Element is %d",item);
        top--;
    }
}
void traverse(){
    int i;
    if(top==-1) printf("\nUNDERFLOW !!!!,Stack is Empty");
    else{
        printf("\nThe Elements of the stack are.....");
        for(i=top;i>=0;i--){
            printf("\n%d",stack[i]);
        }
    }
}