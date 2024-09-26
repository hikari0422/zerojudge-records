#include <iostream>
#include <vector>

using namespace std;

int main() {
    int r, c;
    while (cin >> r >> c) {
        vector<vector<int>> m(r, vector<int>(c));

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cin >> m[i][j];
            }
        }

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                cout << m[i][j] << " ";
            }
            cout << endl;
        }
    }
    return 0;
}