A = int(input())
B = int(input())
C = int(input())


b=list(str(A*B*C))

print(b)
count = [0]*10
for i in range(len(str(A*B*C))):
    a = int(b[i])
    count[a] += 1

for i in range(10):
    print(count[i])


