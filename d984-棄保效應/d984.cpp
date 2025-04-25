#include <iostream>
using namespace std;

int main() {
    long long a, b, c;
    while (cin >> a >> b >> c) {
        if (a <= b && a <= c) {
            b += a;
            a = 0;
        } else if (b <= a && b <= c) {
            c += b;
            b = 0;
        } else {
            a += c;
            c = 0;
        }

        if (a > b && a > c) {
            cout << "A" << endl;
        } else if (b > a && b > c) {
            cout << "B" << endl;
        } else {
            cout << "C" << endl;
        }
    }
    return 0;
}