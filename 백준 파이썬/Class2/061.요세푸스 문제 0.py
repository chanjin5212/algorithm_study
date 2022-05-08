import sys
n, k = map(int, sys.stdin.readline().split())
n_list = list(range(1, n+1))
a = []
while len(n_list) > 0:
    for i in range(k-1):
        n_list.append(n_list.pop(0))
    a.append(n_list[0])
    n_list.pop(0)
print(str(a).replace('[', '<').replace(']', '>'))
