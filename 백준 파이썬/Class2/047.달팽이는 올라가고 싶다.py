# A, B, V = map(int, input().split())
#
# n = 0
# count = 0
# while V > n:
#     n += A
#     count += 1
#     if n >= V:
#         break
#     n -= B
#
# print(count)
import math
A, B, V = map(int, input().split())
print(math.ceil((V - A) / (A - B)) + 1)
