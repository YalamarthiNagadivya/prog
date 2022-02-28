a=[1,2,3,-2,5]
sum_list=[]
dict={}
for i in range(len(a)):
    temp=i
    for j in range(len(a)+1):
        dad=0
        di=tuple(a[i:j])
        for k in range(i,j):
            dad=dad+a[k]
        dict[di]=dad
        #sum_list.append(dad)
v=list(dict.values())

k=list(dict.keys())

print(k[v.index(max(v))])
print(max(v))
