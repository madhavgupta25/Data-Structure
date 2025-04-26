#include <iostream> 
using namespace std;
int main() {
    int i, j ,k = 1;
    for (i=1; i<=9; i+=2) {
        for (j=9 ; j>=i; j-=2 ) {
            cout << " ";
        }
        for (j= 1; j<=i; j++) {
            cout<< k<< " ";
            (k<i) ? k++ : k--;
        }
    }
    return 0;
}