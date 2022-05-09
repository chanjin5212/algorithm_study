# K, N = map(int, input().split())
# line = []
# for i in range(K):
#     line.append(input())
# list_list = []
# for j in range(K):
#     list = []
#     for i in range(1, int(max(line))+1):
#         list.append(int(int(line[j])/i))
#     list_list.append(list)
# list_list_list = []
# for i in range(int(max(line))):
#     count = 0
#     for j in range(K):
#         count += int(list_list[j][i])
#     list_list_list.append(count)
# a = int(list_list_list.index(N))
# while True:
#     if list_list_list[a] != list_list_list[a+1]:
#         break
#     a += 1
# print(a+1)

K, N = map(int, input().split())
line = []
for i in range(K):
    line.append(int(input()))
start = 1
end = max(line)

while start <= end:
    mid = (start + end)//2
    count = 0
    print(mid)
    for i in line:
        count += i//mid
        print(count)
    if count >= N:
        start = mid+1
        print(start)
    else:
        end = mid-1
        print(end)
print(end)








