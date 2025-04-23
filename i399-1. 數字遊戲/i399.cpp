#include <bits/stdc++.h>
using namespace std;

int main() {

    int count = 1;
    vector<int> num;

    for (int i = 0; i < 3; i++) {
        int n = 0;
        cin >> n;
        num.push_back(n);
    }

    sort(num.begin(), num.end(), greater<int>());

    for (int i = 1; i < 3; i++) {
        if (num[i] == num[i - 1]) count++;
    }

    cout << count << " " << num[0];

    for (int i = 1; i < 3; i++) {
        if (num[i] != num[i - 1]) {
            cout << " " << num[i];
        }
    }
}