t = int(input())
for i in range(t):
    N, M = map(int, input().split())
    imp = list(map(int, input().split()))
    imp_or = list(range(len(imp)))
    target = imp_or[M]
    count = 1

    while True:
        if target == imp_or[0] and imp[0] == max(imp):
            print(count)
            break

        elif imp[0] != max(imp):
            imp.append(imp.pop(0))
            imp_or.append(imp_or.pop(0))

        elif imp[0] == max(imp):
            imp.pop(0)
            imp_or.pop(0)
            count += 1