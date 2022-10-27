// Program to perform the various Queue operations
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX 5
int front=-1,rear=-1,queue[MAX],choice;
char ch;
void inqueue();
void dequeue();
void display();
int main(){
    do{
        printf("\nQUEUE OPERATIONS....");
        printf("\n1.INSERTION");
        printf("\n2.DELETION");
        printf("\n3.DISPLAY");
        getch();
        printf("\nEnter Your Choice (1-3) : ");
        scanf("%d",&choice);
        switch(choice){
            case 1:inqueue();
            break;
            case 2:dequeue();
            break;
            case 3:display();
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
void inqueue(){
    int item;
    if(rear==MAX-1) printf("\nOVERFLOW !!!!,Queue is Full");
    else{
        rear++;
        printf("\nEnter the Item You Want to Insert : ");
        scanf("%d",&item);
        queue[rear]=item;
        if(front==-1) front=0;
        printf("\n%d inserted at the rear end of the queue",item);
    }
}
void dequeue(){
    int item;
    if(front==-1 && rear==-1) printf("\nUNDERFLOW !!!!,Queue is Empty");
    else{
        item=queue[front];
        printf("\n%d deleted from the front end of the queue",item);
        if(front==rear) front=rear=-1;
        else{
            if(front==MAX-1) front=-1;
            else front++;
        }
    }
}
void display(){
    int i;
    if(front==-1 && rear==-1) printf("\nUNDERFLOW !!!!,Queue is Empty");
    else{
        printf("\nThe Elements of the Queue are.....");
        for(i=front;i<=rear;i++){
            printf("\n%d",queue[i]);
        }
    }
}