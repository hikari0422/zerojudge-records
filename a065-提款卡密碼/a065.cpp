#include <bits/stdc++.h>
using namespace std;

int main() {
    string passwd;
    cin >> passwd;

    for (int i = 0; i < 6; i++) {
        cout << abs(passwd[i] - passwd[i + 1]);
    }

    return 0;
}