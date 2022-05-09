N = int(input())
n_list = []
for i in range(N):
    h, w = map(int, input().split())
    n_list.append((h, w))
for i in n_list:
    cnt = 1
    for j in n_list:
        if i[0] < j[0] and i[1] < j[1]:
            cnt += 1
    print(cnt, end=" ")