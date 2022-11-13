class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev = null;
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int n1 = prev.get(j);
                    int n2 = prev.get(j - 1);
                    list.add(j, n1 + n2);
                }
            }
            prev = list;
            result.add(i, list);
        }
        return result;
    }
}