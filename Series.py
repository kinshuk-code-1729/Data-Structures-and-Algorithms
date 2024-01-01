n=int(input("Enter nth Term of series : "))
if n%2!=0:
    n1=(n//2)+1
    n2=n//2
elif n%2==0:
    n1=n2=n/2

# 1st Series
a1=1
T1=a1+((n1-1)*4)
S1=(n1*(a1+T1))/2

# 2nd Series
a2=-3
T2=a2+((n2-1)*(-4))
S2=(n2*(a2+T2))/2

# Final Sum
ST=S1+S2
print("Sum Upto",n,"terms of the series 1-3+5-7+9-...... is",ST)
