#include <bits/stdc++.h>
using namespace std;

int main() {
    int a;
    while (cin >> a) {
        long long int num1 = 0, num2 = 0;

        for (int i = 0; i < a; i++) {
            int x;
            cin >> x;
            num1 += x;
            num2 += 1LL * x * x;
        }

        long long int ans = (num1 * num1 - num2) / 2;
        cout << ans << endl;
    }
    return 0;
}