A, B = map(int, input().split())
a = A
b = B
while b != 0:
    a = a % b
    a, b = b, a
print(a)
print(A * B // a)
