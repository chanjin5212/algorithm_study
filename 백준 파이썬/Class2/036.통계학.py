from collections import Counter
import sys
n = int(sys.stdin.readline())
n_list = []
for i in range(n):
    n_list.append(int(sys.stdin.readline()))
n_list.sort()
m = Counter(n_list).most_common(2)
print(round(sum(n_list) / n))
print(n_list[len(n_list) // 2])
if n == 1:
    print(n_list[0])
else:
    if m[0][1] == m[1][1]:
        print(m[1][0])
    else:
        print(m[0][0])
print(max(n_list) - min(n_list))
