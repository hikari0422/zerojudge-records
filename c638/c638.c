#include<stdio.h>
int main() {
    
    const char* first[] = {"庚","辛","壬","癸","甲","乙","丙","丁","戊","己"};
    const char* last[] = {"申","酉","戌","亥","子","丑","寅","卯","辰","巳","午","未"};

    int year;
    while (scanf("%d", &year) == 1) {
        printf("%s%s\n", first[year % 10], last[year % 12]);
    }

    return 0;
}