numbers = [0]*10
for i in range(10):
    numbers[i] = int(input()) % 42
numbers.sort()
count = 0
for i in range(9):
    if numbers[i] != numbers[i+1]:
        count += 1
print(count+1)

# 짧은 풀이
# numbers = []
# for i in range(10):
#     num = int(input()) % 42
#     if num not in numbers:
#         numbers.append(num)
# print(len(numbers))