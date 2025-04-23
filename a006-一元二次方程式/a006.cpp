#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a, b, c;

    cin >> a >> b >> c;

    int d = b * b - 4 * a *c;

    if (d > 0) {
        int root1 = int(-b + sqrt(d)) / (2 * a);
        int root2 = int(-b - sqrt(d)) / (2 * a);
        cout << "Two different roots x1=" << root1 << " , x2=" << root2;
    } else if (d == 0) {
        int root = int(-b + sqrt(d)) / (2 * a);
        cout << "Two same roots x=" << root;
    } else {
        cout << "No real root";
    }
    
    return 0;
}