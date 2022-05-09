import sys
n = int(sys.stdin.readline())
n_list = []
for i in range(n):
    age, name = sys.stdin.readline().split()
    age = int(age)
    n_list.append((age, name))

n_list.sort(key=lambda x: int(x[0]))
for a, b in n_list:
    print(a, b)
