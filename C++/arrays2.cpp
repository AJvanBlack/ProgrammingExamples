#include <iostream>
using namespace std;

int main() {
    int x[5] = {1, 2, 3, 4, 5};
    x[2] = 10;                            // This substitutes the value of the third element in the array
    cout << x[2];
  return 0;
}
