word = input().upper()

count = {}

for i in range(len(word)):
    if word[i] in count.keys():
        count[word[i]] +=1

    else:
        count[word[i]] = 1

a = max(count.values())
max_count = 0
answer = ""
for key, value in count.items():
    if count[key] == a:
        answer = key
        max_count += 1

if max_count > 1 :
    print("?")
else:
    print(answer)








