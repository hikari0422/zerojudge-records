#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    while (cin >> n) {
        vector<int> num;
        for (int i = 1; i <= n; i++) {
            int input;
            cin >> input;
            num.push_back(input);
        }

        sort(num.begin(), num.end(), greater<int>());
        
        sort(num.begin(), num.end(), [](int a, int b) {
            if ((abs(a) % 10) != (abs(b) % 10)) return (abs(a) % 10) < (abs(b) % 10);
            return a > b;
        });

        for (int i : num) {
            cout << i << " ";
        }
        cout << endl;
    }    
}