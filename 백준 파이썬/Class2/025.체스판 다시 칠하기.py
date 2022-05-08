N, M = map(int, input().split())
chess = []
count = []

for _ in range(N):
    chess.append(input())

for a in range(N - 7):
    for i in range(M - 7):
        count1 = 0
        count2 = 0
        for b in range(a, a + 8):
            for j in range(i, i + 8):
                if (j + b) % 2 == 0:
                    if chess[b][j] != 'W':
                        count1 += 1
                    if chess[b][j] != 'B':
                        count2 += 1
                else :
                    if chess[b][j] != 'B':
                        count1 += 1
                    if chess[b][j] != 'W':
                        count2 += 1
        count.append(count1)
        count.append(count2)
print(min(count))
