a = list(map(int, input().split()))
print(a)
for i in range(5):
    a[i] = int(a[i]*a[i])

b = sum(a)
c = b%10
print(c)