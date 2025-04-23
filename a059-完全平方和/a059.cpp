#include <bits/stdc++.h>
using namespace std;

int main() {
    int a;
    cin >> a;
    vector<int> ans;
    for (int i = 0; i < a; i++) {
        int x, y = 0;
        int num = 0;
        cin >> x;
        cin >> y;
        for (int i = x; i <= y; i++) {
            if (floor(sqrt(i)) == sqrt(i)) {
                num += i;
            }
        }
        ans.push_back(num);
    }
    
    for (int i = 0; i < a; i++) {
        cout << "Case " << i + 1 << ": " << ans[i] << endl;
    }
}