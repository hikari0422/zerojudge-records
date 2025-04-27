#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;

    while (cin >> n >> k) {
        if (k != 0 && n % k == 0 || n == 0) {
            cout << "Ok!" << endl;
        } else {
            cout << "Impossib1e!" << endl;
        }
    }
}