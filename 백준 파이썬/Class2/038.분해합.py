try:
    n = int(input())
    m_lst = []
    for j in range(n):
        m = list(map(int, str(j)))
        s = j + sum(m)
        m_lst.append(s)
    print(m_lst.index(n))

except ValueError:
    print("0")
