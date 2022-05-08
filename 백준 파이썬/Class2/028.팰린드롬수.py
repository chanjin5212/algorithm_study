# a = "0"
# b = ""
# numbers = []
# while b != a :
#     b = input()
#     numbers.append(b)
#
# for i in range(len(numbers)-1):
#     if numbers[i][::-1] == numbers[i]:
#         print("yes")
#     else:
#         print("no")
#

while True:
    n = input()
    if n == "0":
        break

    if n == n[::-1]:
        print("yes")
    else:
        print("no")

