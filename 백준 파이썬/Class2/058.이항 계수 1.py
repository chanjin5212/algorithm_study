# n, k = map(int, input().split())
# n1 = 1
# n2 = 1
# k1 = 1
# for i in range(1, n+1):
#     n1 *= i
# for i in range(1, n-k+1):
#     n2 *= i
# for i in range(1, k+1):
#     k1 *= i
# print(int(n1/(n2*k1)))
import sys
def factorial(n):
    if n == 1 or n == 0:
        return 1
    elif n > 1:
        return n * factorial(n-1)
n, k = map(int, input().split())
print(int(factorial(n)/(factorial(n-k)*factorial(k))))
