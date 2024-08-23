#include <stdio.h>
#include <math.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    int d = b * b - 4 * a *c;

    if (d > 0) {
        int root1 = (int) ((-b + sqrt(d)) / (a * a));
        int root2 = (int) ((-b - sqrt(d)) / (a * a));
        printf("Two different roots x1=%d , x2=%d", root1, root2);
    } else if (d == 0) {
        int root = (int) ((-b + sqrt(d)) / (a * a));
        printf("Two same roots x=%d", root);
    } else {
        printf("No real root");
    }

    return 0;
}