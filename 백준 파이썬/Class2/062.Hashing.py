import sys
n = int(sys.stdin.readline())
str = sys.stdin.readline()
answer = 0
for i in range(n):
    answer += (ord(str[i])-96) * (31 ** i)
print(answer % 1234567891)
