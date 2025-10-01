#include <bits/stdc++.h>
using namespace std;

int main() {
    string n;
    while (cin >> n) {
        string w;

        for (char c : n) {
            if (isalpha(c)) {
                w += tolower(c);
            }
        }

        int freq[26] = {0};
        for (char c : w) {
            freq[c - 'a']++;
        }

        for (int x : freq) {
            cout << x << ", ";
        }
        cout << endl;

        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) oddCount++;
        }

        if ((w.size() % 2 == 0 && oddCount == 0) || (w.size() % 2 == 1 && oddCount == 1)) {
            cout << "yes !" << endl;
        } else {
            cout << "no..." << endl;
        }
    }
}