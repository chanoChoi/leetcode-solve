class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        
        for (int i = 0; i < flowerbed.length;) {
            if (flowerbed[i] == 0) {
                if ((i + 1 < flowerbed.length && flowerbed[i + 1] == 0) || i + 1 == flowerbed.length) {
                    flowerbed[i] = 1;
                    n = n - 1;
                    i = i + 2;
                    if (n == 0) break;
                } else {
                    i = i + 3;
                }
            } else {
                i = i + 2;
            }
        }
        return n == 0;
    }
}