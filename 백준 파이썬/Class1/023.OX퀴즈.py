T = int(input())

ox = {}
for i in range(T):
    ox[i] = input()
sum1 = []

for i in range(T):
    count1 = []
    count = 0
    for j in range(len(ox[i])):
        if ox[i][j] == "O":
            count += 1
            count1.append(count)
        else:
            count = 0
            count1.append(count)

    sum1.append(sum(count1))

for i in range(len(sum1)):
    print(sum1[i])

# 쉬운 풀이
# iter_count = int(input())
#
# for count in range(iter_count):
#     result_list = list(input())
#
#     score = 0
#     total_score = 0
#     for result in result_list:
#         if result == "O":
#             score += 1
#             total_score += score
#         else:
#             score = 0
#     print(total_score)




