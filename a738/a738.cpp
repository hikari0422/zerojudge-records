#include <iostream>
using namespace std;

int main() {
    int a = 0, b = 0;
    while (cin >> a >> b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        cout << a << endl;
    }
}
