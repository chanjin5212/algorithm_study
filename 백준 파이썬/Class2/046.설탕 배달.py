n = int(input())
count = 0
while True:
    if n % 5 == 0 and n > 0:
        print(int(n / 5) + count)
        break
    elif n == 0:
        print(count)
        break
    elif n < 0:
        print("-1")
        break
    n -= 3
    count += 1
