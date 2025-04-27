#include <bits/stdc++.h>
using namespace std;

bool ArmstrongNumber(int x) {
    string n = to_string(x);
    int num = 0;
    for (char c : n) {
        num += pow(c - '0', n.size());
    }
    return x == num;
}

int main() {
    int n, m;
    cin >> n >> m;

    vector<int> armstrongNumbers;
    for (int i = n; i <= m; i++) {
        if (ArmstrongNumber(i)) {
            armstrongNumbers.push_back(i);
        }
    }

    if (!armstrongNumbers.empty()) {
        for (int num : armstrongNumbers) {
            cout << num << " ";
        }
    } else {
        cout << "none";
    }
}