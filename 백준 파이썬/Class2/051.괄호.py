# n = int(input())
# for i in range(n):
#     a = input()
#     b = []
#     temp = True
#     if a[0] == ")" or a[-1] == "(":
#         print("NO")
#     else:
#         for j in a:
#             if j == "(":
#                 b.append(j)
#             elif j == ")":
#                 if not b:
#                     temp = False
#                     break
#                 elif b[-1] == "(":
#                     b.pop()
#                 else:
#                     temp = False
#                     break
#         if len(b) != 0 or temp == False:
#             print("NO")
#         else:
#             print("YES")
n = int(input())
for i in range(n):
    a = input()
    sum = 0
    if a[0] == ")" or a[-1] == "(":
        print("NO")
    else:
        for j in a:
            if j == "(":
                sum += 1
            elif j == ")":
                sum -= 1
            if sum < 0:
                print("NO")
                break
        if sum > 0:
            print("NO")
        elif sum == 0:
            print("YES")
