#include <bits/stdc++.h>
using namespace std;

string intToRoman(int n) {
    string romanSymbols[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    string result = "";
    for(int i = 0; i < 13; i++) {
        while(n >= values[i]) {
            result += romanSymbols[i];
            n -= values[i];
        }
    }
    return result;
}

int romanToInt(string n) {
    unordered_map<char, int> m = {{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};
    int total = 0;
    for(int i = 0; i < n.size(); i++){
        if(i + 1 < n.size() && m[n[i]] < m[n[i + 1]]) {
            total -= m[n[i]];
        } else {
            total += m[n[i]];
        }
    }
    return total;
}

int main() {
    while (true) {
        string a = "";
        string b = "";
        cin >> a;
        if (a == "#") {
            break;
        }
        cin >> b;

        int ans = abs(romanToInt(a) - romanToInt(b));
        
        if (ans == 0) {
            cout << "ZERO" << endl;
        } else {
            cout << intToRoman(ans) << endl;
        }
    }
}