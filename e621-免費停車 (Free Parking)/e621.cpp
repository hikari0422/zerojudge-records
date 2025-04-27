#include <bits/stdc++.h>
using namespace std;

int main() {
    int day;
    cin >> day;

    for (int i = 0; i < day; ++i) {
        int a, b, c;
        cin >> a >> b >> c;
        vector<int> free_spaces;
        for (int j = a + 1; j < b; ++j) {
            if (j % c != 0) {
                free_spaces.push_back(j);
            }
        }

        if (free_spaces.empty()) {
            cout << "No free parking spaces." << endl;
        } else {
            for (size_t j = 0; j < free_spaces.size(); ++j) {
                cout << free_spaces[j] << (j == free_spaces.size() - 1 ? "" : " ");
            }
            cout << endl;
        }
    }
}