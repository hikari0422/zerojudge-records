#include <stdio.h>
#include <stdlib.h>

int main() {
    char passwd[8];
    scanf("%s", &passwd);

    for (int i = 0; i < 6; i++) {
        printf("%d", abs(passwd[i] - passwd[i + 1]));
    }
    return 0;
}