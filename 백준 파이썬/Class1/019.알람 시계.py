time = list(map(int, input().split()))

if time[1] >= 45:
    print(time[0], time[1]-45)
elif time[1] < 45:
    print(time[0]-1, time[1] + 15)
elif time[0] == 0 and time[1] < 45:
    print(23, time[1] + 15)

