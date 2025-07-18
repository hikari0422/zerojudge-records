#include <bits/stdc++.h>
using namespace std;
using ll = long long;

ll mulmod(ll a, ll b, ll mod) {
    return (__int128)a * b % mod;
}

ll powmod(ll a, ll b, ll mod) {
    ll res = 1;
    a %= mod;
    while (b > 0) {
        if (b & 1) res = mulmod(res, a, mod);
        a = mulmod(a, a, mod);
        b >>= 1;
    }
    return res;
}

bool isPrime(int n) {
    if (n < 2) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0) return false;

    int d = n - 1, r = 0;
    while (d % 2 == 0) d /= 2, ++r;

    int bases[] = {2, 3};
    for (int a : bases) {
        if (a >= n) continue;
        ll x = powmod(a, d, n);
        if (x == 1 || x == n - 1) continue;

        bool pass = false;
        for (int i = 1; i < r; ++i) {
            x = mulmod(x, x, n);
            if (x == n - 1) {
                pass = true;
                break;
            }
        }
        if (!pass) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int x;
    while (cin >> x) {
        cout << (isPrime(x) ? "質數\n" : "非質數\n");
    }
    return 0;
}
