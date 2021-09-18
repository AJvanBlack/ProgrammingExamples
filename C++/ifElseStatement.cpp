#include <iostream>
using namespace std;

int main() {
  int mark = 90;
  if (mark > 50) {
    cout << "Congratulations! You have passed" << endl;
  }
  else {
    cout << "Unfortunately you have failed" << endl;
  }
  return 0;
}

// The compiler will test the condition:
// - If it evaluates to true, then the code inside the if statement will be executed.
// - If it evaluates to false, then the code inside the else statement will be executed.
