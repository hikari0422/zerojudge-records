import math

a, b, c = map(int, input().split())

d = b ** 2 - 4 * a * c

if d > 0:
    root1 = int((-b + math.sqrt(d)) / (2 * a))
    root2 = int((-b - math.sqrt(d)) / (2 * a))
    print(f"Two different roots x1={root1} , x2={root2}")
elif d == 0:
    root = int((-b + math.sqrt(d)) / (2 * a))
    print(f"Two same roots x={root}")
else:
    print("No real root")