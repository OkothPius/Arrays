#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int i, fibonacci[20];
    fibonacci[0] = 1;
    fibonacci[1] = 2;

    for (int i = 2; i < 20; i++) {
        fibonacci[i] = fibonacci[i - 2] + fibonacci[1 - 1];
    }

    for (int i = 0; i < 20; i++) {
        printf( "fibonacci[ %d ] = %f\n", i, fibonacci[i]);
        
    }
}
