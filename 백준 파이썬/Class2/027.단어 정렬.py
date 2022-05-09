N = int(input())

word_list = []
for i in range(N):
    word_list.append(input())

words = list(set(word_list))

word_list2 = []
for i in words:
    word_list2.append((len(i), i))
    print(word_list2)
word_list2.sort()
for word_len, word in word_list2:
    print(word)



