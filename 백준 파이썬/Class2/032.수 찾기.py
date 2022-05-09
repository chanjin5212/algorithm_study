N = int(input())
N_list = list(map(int, input().split()))
N_list.sort()
M = int(input())
M_list = list(map(int, input().split()))

def binary(target):
    left = 0
    right = N-1

    while left <= right:
        mid = (left + right) // 2
        if N_list[mid] == target:
            return True
        if target < N_list[mid]:
            right = mid - 1
        elif target > N_list[mid]:
            left = mid + 1


for i in range(M):
    if binary(M_list[i]):
        print("1")
    else:
        print("0")
