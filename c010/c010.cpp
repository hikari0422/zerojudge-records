#include <bits/stdc++.h>
using namespace std;

int main() {
    int n = 0;
    vector<int> numbers;

    while(cin >> n) {
        numbers.push_back(n);
        sort(numbers.begin(), numbers.end());

        int size = numbers.size();

        if (size % 2 == 1) {
            cout << numbers[size / 2] << endl;
        } else {
            double median = (numbers[size / 2 - 1]) / 2.0;
            cout << median << endl; 
        }
        // for (int i : numbers) {
        //     cout << "內容: " << i << " ";
        // }
    }
}