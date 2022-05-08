x, y, w, h = map(int, input().split())

a = w-x
b = h-y

numbers = [x, y, a, b]
print(min(numbers))