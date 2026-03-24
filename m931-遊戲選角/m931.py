n = int(input())
pl = []
for i in range(n):
    p = input()
    ps = p.split()
    r = pow(int(ps[0]), 2) + pow(int(ps[1]), 2)
    pl.append([p, r])
    
pl.sort(key = lambda x:x[1])

print(pl[(len(pl) - 1) - 1][0])