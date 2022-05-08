# import sys
# n = int(sys.stdin.readline())
# n_list = list(map(int, sys.stdin.readline().split()))
# m = int(sys.stdin.readline())
# m_list = list(map(int, sys.stdin.readline().split()))
# count = []
# for i in range(m):
#     cnt = 0
#     for j in range(n):
#         if m_list[i] == n_list[j]:
#             cnt += 1
#     count.append(cnt)
# for i in count:
#     print(i, end=" ")
from collections import Counter
import sys
n = int(sys.stdin.readline())
n_list = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
m_list = list(map(int, sys.stdin.readline().split()))
dic = dict()

for i in n_list:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1

for i in m_list:
    if i in dic:
        print(dic[i], end=" ")
    else:
        print("0", end=" ")
