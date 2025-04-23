// #include <iostream>
// #include <algorithm>
// #include <vector>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int a;
    cin >> a;

    vector<int> num;

    for (int i = 0; i < a; i++) {
        int n; cin >> n;
        num.push_back(n);
    }

    sort(num.begin(), num.end());

    for (int i : num) {
        cout << i << " ";
    }
}