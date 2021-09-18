#include <iostream>
using namespace std;

int main() {

  int array[] = {1, 2, 3, 4, 5};
  int sum = 0;
    for (int x = 0; x < 5; x++) {
      sum += array[x];
    }
      cout << sum << endl;
  return 0;
}

// The code above creates space for 5 integers sums all the elements int the array
