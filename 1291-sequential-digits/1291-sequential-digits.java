class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String tmp = "123456789";
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j + i <= 9; j++) {
                String substr = tmp.substring(j, j + i);
                int val = Integer.parseInt(substr);
                if (low <= val && val <= high) {
                    list.add(val);
                }
            }
        }
        return list;
    }
}