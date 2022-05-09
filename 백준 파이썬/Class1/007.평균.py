a = int(input())
scores = list(map(int, input().split()))
max = max(scores)

for i in range(a):
    scores[i] =  scores[i]/max*100

print(sum(scores)/a)









