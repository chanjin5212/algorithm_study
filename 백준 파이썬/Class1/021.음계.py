num = list(map(int, input().split()))

count1 = 0
for i in range(7):
    if num[i]+1 == num[i+1]:
        count1 += 1
count2 = 0
for i in range(7):
    if num[i]-1 == num[i+1]:
        count2 += 1

if count1 == 7:
    print("ascending")
elif count2 == 7:
    print("descending")
else:
    print("mixed")