N, M = map(int, input().split())
n_list = list(map(int, input().split()))
m_list = []
for i in range(len(n_list)-2):
    for j in range(i+1, len(n_list)):
        for k in range(j+1, len(n_list)):
            if n_list[i] + n_list[j] + n_list[k] <= M:
                m_list.append(n_list[i] + n_list[j] + n_list[k])
print(max(m_list))
