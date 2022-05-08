import sys
k = int(sys.stdin.readline())
k_list = []
for i in range(k):
    a = int(sys.stdin.readline())
    if a == 0:
        k_list.pop()
    else:
        k_list.append(a)

print(sum(k_list))
