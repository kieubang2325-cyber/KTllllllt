#Đỗ Tùng Dương 202418882
def bublle_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(n-1,i,-1):
            if arr[j] > arr[j-1]:
                swap(arr,j,j-1)
def swap(arr,i,j):
    temp = arr[i]
    arr[i]=arr[j]
    arr[j]=temp
#test
print("Nhập mảng: ")
arr = list(map(int,input().split()))
bublle_sort(arr)
print("Mảng sau khi sắp xếp: ", arr)