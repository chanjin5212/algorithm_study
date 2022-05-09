while True:
    n = input()
    if n == ".":
        break
    n_list = []
    temp = True
    for i in n:
        if i == "(" or i == "[":
            n_list.append(i)
        elif i == "]":
            if not n_list or n_list[-1] == "(":
                temp = False
                break
            elif n_list[-1] == "[":
                n_list.pop()
        elif i == ")":
            if not n_list or n_list[-1] == "[":
                temp = False
                break
            elif n_list[-1] == "(":
                n_list.pop()
    if temp == True and not n_list:
        print("yes")
    else:
        print("no")
