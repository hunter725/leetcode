class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) return 0;
        int i = 0;
        while (num != 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            i++;
        }
        return i;
    }
}