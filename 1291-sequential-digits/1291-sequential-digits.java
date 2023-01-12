class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String tmp = "123456789";
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j + i <= 9; j++) {
                String subStr = tmp.substring(j, j + i);
                int cur = Integer.parseInt(subStr);
                if (low <= cur && cur <= high) {
                    list.add(cur);
                }
            }
        }
        
        return list;
    }
}