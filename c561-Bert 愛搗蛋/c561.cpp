#include <bits/stdc++.h>
using namespace std;

int reverseNumber(int n) {
    int reversed = 0;
    while (n > 0) {
        reversed = reversed * 10 + n % 10;
        n /= 10;
    }
    return reversed;
}

int main() {
    int n;
    cin >> n;
    vector<int> numbers(n);

    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        numbers[i] = reverseNumber(num);
    }

    cout << *max_element(numbers.begin(), numbers.end()) << endl;
    return 0;
}