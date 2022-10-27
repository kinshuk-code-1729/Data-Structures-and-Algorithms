// Program for mark sheet generation using If-Else
#include<stdio.h>
int main(){
  float m1,m2,m3,m4,m5,p;
  printf("Enter the Marks of 5 Subjects Out of 100 For the Student : ");
  scanf("%f%f%f%f%f",&m1,&m2,&m3,&m4,&m5);
  p=((m1+m2+m3+m4+m5)/500)*100;
  if(p>=80 && p<=100){
    printf("\nThe Student Scored an Aggregate of %5.2f %% and is a Merit Holder",p);
  }
  else if(p>=60 && p<=79){
    printf("\nThe Student Scored an Aggregate of %5.2f %% and has Achieved 1st Division",p);
  }
  else if(p>=50 && p<=59){
    printf("\nThe Student Scored an Aggregate of %5.2f %% and has Achieved 2nd Division",p);
  }
 else if(p>=40 && p<=49){
    printf("\nThe Student Scored an Aggregate of %5.2f %% and has Achieved 3rd Division",p);
  }
 else if(p<40){
    printf("\nThe Student Scored an Aggregate of %5.2f %% and so the Student's Result is Fail",p);
  }
  return 0;
}