class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j + i <= 9; j++) {
                String tmp = str.substring(j, j + i);
                int val = Integer.parseInt(tmp);
                if (val >= low && val <= high) {
                    answer.add(val);
                }
            }
        }
        return answer;
    }
}