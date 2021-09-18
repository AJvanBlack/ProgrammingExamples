#include <iostream>
using namespace std;

int sum(int a, int b=42) {
    int result = a + b;
    return (result);
}

int main() {
    int x = 24;
    int y = 36;

    //calling the function with both parameters
    int result = sum(x, y);
    cout << result << endl;

    //calling the function without b
    result = sum(x);
    cout <<  result << endl;

  return 0;
}

// When defining a function, you can specify a default value for each of the last parameters.
// If the corresponding argument is missing when you call a function, it uses the default value.
