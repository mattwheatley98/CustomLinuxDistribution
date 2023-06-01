#include <stdio.h>
#include <stdlib.h>

int main() {
    const unsigned char screenAddress = 0x3c; //I2C address of the SCREEN
    const unsigned char screenRegister = 0x00; // Address of the SCREEN REGISTER?
    const char fileName[] = "/dev/i2c-1"; // Location of the I2C device file

    printf("Hello, world!\n");
}