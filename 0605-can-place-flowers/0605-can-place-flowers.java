class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0){
                boolean leftPlot = (i - 1 < 0 || flowerbed[i - 1] == 0);
                boolean rightPlot = (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0);
                if (leftPlot && rightPlot) {
                    cnt = cnt + 1;
                    flowerbed[i] = 1;
                }
            }   
        }
        return cnt >= n;
    }
}