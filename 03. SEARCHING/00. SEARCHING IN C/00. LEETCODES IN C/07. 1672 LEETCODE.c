#include <stdio.h>
int maximumWealth(int accounts[][100], int accountsSize, int accountsColSize) {
    int maxWealth = 0;
    for (int i = 0; i < accountsSize; i++) {
        int wealth = 0;
        for (int j = 0; j < accountsColSize; j++) {
            wealth += accounts[i][j];
        if (wealth > maxWealth) {
            maxWealth = wealth;
        }
    }
    return maxWealth;
}
int main() {
    int accounts[2][100] = {{1,2,3}, {3,2,1}};
    int accountsSize = 2;
    int accountsColSize = 3;
    int result = maximumWealth(accounts, accountsSize, accountsColSize);
    printf("Maximum Wealth: %d\n", result);
    return 0;
}
