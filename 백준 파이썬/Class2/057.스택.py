import sys
n = int(sys.stdin.readline())
n_list = []

for i in range(n):
    a = sys.stdin.readline().split()
    if a[0] == "push":
        n_list.append(a[1])
    elif a[0] == "pop":
        if len(n_list) == 0:
            print("-1")
        else:
            print(n_list.pop())
    elif a[0] == "size":
        print(len(n_list))
    elif a[0] == "empty":
        if len(n_list) == 0:
            print("1")
        else:
            print("0")
    elif a[0] == "top":
        if len(n_list) == 0:
            print("-1")
        else:
            print(n_list[-1])
