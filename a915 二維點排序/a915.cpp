#include <bits/stdc++.h>
using namespace std;

int main() {
    int a;
    cin >> a;
    vector<pair<int, int>> point;

    for (int i = 0; i < a; i++) {
        int x = 0, y = 0;
        cin >> x >> y;
        point.push_back(make_pair(x, y));   
    }

    sort(point.begin(), point.end());

    for (auto& i : point) {
        cout << i.first << " " << i.second << endl;
    }
}