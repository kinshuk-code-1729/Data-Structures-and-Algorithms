def binarySearch (arr, first, last, x):
    if last >= first:
        mid =int( first + (last - first)/2)
        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binarySearch(arr, first, mid-1, x)
        else:
            return binarySearch(arr, mid+1, last, x)
    else:
        return -1

arr = [ 1,3,5,6,7,8,10,13,14 ]
x = 10
result = binarySearch(arr, 0, len(arr)-1, x)

if result != -1:
    print ("Element is present at index %d" % result)
else:
    print ("Element is not present in array")
    
