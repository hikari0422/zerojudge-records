first = ["庚","辛","壬","癸","甲","乙","丙","丁","戊","己"]
last = ["申","酉","戌","亥","子","丑","寅","卯","辰","巳","午","未"]

while True:
    year = int(input())
    print(first[year % 10] + last[year % 12])

# ERROR