def A(fl, ll):
    if (fl[1] != fl[3] and fl[1] == fl[5]) and (ll[1] != ll[3] and ll[1] == ll[5]):
        return True
    else: return False

def B(fl, ll):
    if fl[6] == "1" and ll[6] == "0":
        return True
    else: return False

def C(fl, ll):
    if fl[1] != ll[1] and fl[3] != ll[3] and fl[5] != ll[5]:
        return True
    else: return False

number = int(input())

for i in range(number):
    fl = list(input().replace(" ", ""))
    ll = list(input().replace(" ", ""))

    res = ""
    if A(fl, ll) == False:
        res += "A"
    if B(fl, ll) == False:
        res += "B"
    if C(fl, ll) == False:
        res += "C"
    if res == "":
        res = "None"
    
    print(res)
