# 시간 초과
# N, M = map(int, input().split())
# tree = list(map(int, input().split()))
#
# tree_sum = []
# for i in range(max(tree)):
#     tree_list = []
#     for j in tree:
#         if j - i > 0:
#             tree_list.append(j - i)
#     tree_sum.append(sum(tree_list))
#     tree_list.clear()
# count = 0
# for i in tree_sum:
#     if i > M:
#         count += 1
# print(count)
import sys
N, M = map(int, sys.stdin.readline().split())
tree = list(map(int, sys.stdin.readline().split()))
start, end = 1, max(tree)

while start <= end:
    mid = (start + end) // 2
    log = 0
    for i in tree:
        if i >= mid:
            log += i - mid

    if log >= M:
        start = mid + 1
    else:
        end = mid - 1
print(end)
