#include <bits/stdc++.h>
using namespace std;

int check(int s) {
    return (10 - (s % 10)) % 10;
}

int main() {
    vector<pair<char, string>> code = {
        {'A', "10"}, {'B', "11"}, {'C', "12"}, {'D', "13"}, {'E', "14"},
        {'F', "15"}, {'G', "16"}, {'H', "17"}, {'I', "34"}, {'J', "18"},
        {'K', "19"}, {'L', "20"}, {'M', "21"}, {'N', "22"}, {'O', "35"},
        {'P', "23"}, {'Q', "24"}, {'R', "25"}, {'S', "26"}, {'T', "27"},
        {'U', "28"}, {'V', "29"}, {'W', "32"}, {'X', "30"}, {'Y', "31"}, {'Z', "33"}
    };

    string id;

    while (cin >> id) {
        vector<char> result;
        for (auto &p : code) {
            int s = 0;

            s += (p.second[0] - '0') * 1;
            s += (p.second[1] - '0') * 9;

            for (int i = 0; i < 8; i++) {
                s += (id[i] - '0') * (8 - i);
            }

            if (check(s) == (id[8] - '0')) {
                cout <<p.first;
            }
        }
        cout << endl;
    }
}