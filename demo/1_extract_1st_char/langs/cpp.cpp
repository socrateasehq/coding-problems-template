
#include <iostream>
#include <string.h>

using namespace std;

char first_character(string s) {
    return(s[0]);   
}

int main() {

    string s;
    cin >> s;

    char c = first_character(s);
    cout << c;

    return 0;
}