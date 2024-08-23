#include<iostream>
using namespace std;
int main()
{
    const string first[] = {"庚","辛","壬","癸","甲","乙","丙","丁","戊","己"};
    const string last[] = {"申","酉","戌","亥","子","丑","寅","卯","辰","巳","午","未"};

    int year;
    while (cin >> year) {
        cout << first[year % 10] << last[year % 12] << "\n";
    }

    return 0;
}