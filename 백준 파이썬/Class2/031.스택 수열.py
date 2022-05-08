n = int(input())
stack = []
pop = []
count = 1
temp = True
for i in range(n):
    num = int(input())
    while count <= num:
        stack.append(count)
        pop.append("+")
        count += 1

    if stack[-1] == num:
        stack.pop()
        pop.append("-")
    else:
        temp = False
if temp == False:
    print("NO")
else:
    for i in pop:
        print(i)


