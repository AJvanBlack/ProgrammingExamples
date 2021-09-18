#include <iostream>
using namespace std;

int main() {

  int userAge;
    cout << "How old are you?" << endl;
    cin >> userAge;

  switch (userAge) {
    case 17:
      cout << "Too young";
      break;
    case 24:
      cout << "Perfect";
      break;
    case 32:
      cout << "Too old";
      break;
  }
  return 0;
}

// Switch evaluates the expression to determine whether it's equal to the value
// in the case statement. If a match is found, it executes the statements in that case.
