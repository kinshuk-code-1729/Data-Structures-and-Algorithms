import math
def fact(k):
    if k<=1:
        return 1
    else:
        return k*fact(k-1)

step=int(input("How many terms : "))
x=int(input("Enter the value of x :"))
sum=0
for i in range(step+1):
    sum+=(math.pow(-1,i)*math.pow(x,2*i+1))/fact(2*i+1)

print("The result of sin",'(', x, ')', "is :", sum)
