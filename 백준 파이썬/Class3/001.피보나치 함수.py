import sys

dic = {}
def fibonacci(n):
    if n in dic:
        return dic[n]
    if n == 0:
        dic[0] = 0
        return 0
    elif n == 1:
        dic[1] = 1
        return 1
    else:
        dic[n] = fibonacci(n-1) + fibonacci(n-2)
        return dic[n]

t = int(sys.stdin.readline())
for i in range(t):
    n = int(sys.stdin.readline())
    if n == 0:
        print('1', '0')
    else:
        print(fibonacci(n-1), fibonacci(n))
