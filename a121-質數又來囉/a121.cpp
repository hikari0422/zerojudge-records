#include <bits/stdc++.h>
using namespace std;

bool isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int main() {
    int a = 0, b = 0;
    int counter = 0;

    while (cin >> a >> b) {

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }

        cout << counter << endl;

        a = 0, b = 0, counter = 0;
    }
}