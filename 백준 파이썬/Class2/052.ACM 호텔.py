n = int(input())
for i in range(n):
    n_list = []
    H, W, N = map(int, input().split())
    a = N // H + 1
    b = N % H
    if N % H == 0:
        a = N // H
        b = H

    print(f"{b*100+a}")
