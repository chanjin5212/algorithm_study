m, n, k = map(int, input().split())
a = []
for i in range(n):
    b = []
    for j in range(m):
        b.append(0)
    a.append(b)

for i in range(k):
    x, y = map(int, input().split())
    a[y][x] += 1

for i in a:
    print(i)
