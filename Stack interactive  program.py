class Stack:
    def __init__(self):
        self.items = []
    def is_empty(self):
        return self.items == []
    def push(self, data):
        self.items.append(data)
    def pop(self):
        return self.items.pop()
s = Stack()
while True:
    print('Press 1 for push')
    print('Press 2 for pop')
    print('Press 3 for quit')
    operation = int(input('What would you like to do ?? '))
    if operation == 1:
        n=int(input("enter a number to push : "))
        s.push(n)
    elif operation == 2:
        if s.is_empty():
            print('Stack is empty.')
        else:
            print('Popped value: ', s.pop())
    elif operation == 3:
        print("Okk Thank You & Please Visit Again")
        break
