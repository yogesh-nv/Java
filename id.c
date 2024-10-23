#include <iostream>
#include <string>

using namespace std;

int main() {
    int n;
    cin >> n;

    string id[n];
    int stock[n], r;

    for (int i = 0; i < n; i++) {
        cin >> id[i];
        cin >> stock[i];
    }

    cin >> r;

    int i;
    int min = INT_MAX; // Initialize min to the maximum possible integer value

    for (i = 0; i < n; i++) {
        if (stock[i] < min) {
            min = stock[i];
        }
    }

    cout << id[i] << " " << stock[i] + r << endl;

    return 0;
}