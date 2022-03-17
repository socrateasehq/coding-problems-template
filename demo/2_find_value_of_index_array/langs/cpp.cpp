//User Boilerplate
#include <iostream>
#include <string.h>

using namespace std;

char get_value_at_index(int index, int arr[]) {
    //write your code here
}

//Compiler Boilerplate

int main() {

    int numOfElements;
    cin >> numOfElements;
    int arr[numOfElements];
    for (int i=0;i<numOfElements;i++)
        cin >> arr[i];
    int index;
    cin >> index;
    char c = get_value_at_index(index, arr);
    cout << c;
    return 0;
}