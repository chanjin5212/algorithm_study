t = int(input())
for i in range(t):
    floor = int(input())
    num = int(input())
    f0 = [x for x in range(1, num+1)]
    for j in range(floor):
        for k in range(1, num):
            f0[k] += f0[k-1]
    print(f0[-1])
