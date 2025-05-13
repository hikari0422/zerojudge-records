#include <bits/stdc++.h>
using namespace std;

int main() {
    int a;
    cin >> a;
    for (int i = 0; i < a; i++) {
        int n = 0;
        double sum = 0;
        cin >> n;
        for (int j = 0; j < n; j++) {
            int num = 0;
            cin >> num;
            sum += num;
        }
        sum /= n;
        cout << fixed << setprecision(2) << sum << endl;
    }
}