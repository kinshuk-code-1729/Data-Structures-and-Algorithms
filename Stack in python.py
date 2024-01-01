import queue
L = queue.LifoQueue(maxsize=6)
print(L.qsize())
# Data Inserted as 5->3->7
L.put(5)
L.put(3)
L.put(7)
print("Full: ", L.full())
print("Size: ", L.qsize())
# Data will be accessed in the
# reverse order Reverse of that
# of Queue
print(L.get())
print(L.get())
print(L.get())
print("Empty: ", L.empty())
