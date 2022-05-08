# n = int(input())
# b = 7
# count = 2
# if 1 < n <= b:
#     print("2")
# elif n == 1:
#     print("1")
# else:
#     for i in range(2, n):
#         if n > b:
#             b += i*6
#             count += 1
#         else:
#             print(count)
#             break

n = int(input())
b = 1
count = 1
while n > b:
    b += 6*count
    count += 1

print(count)