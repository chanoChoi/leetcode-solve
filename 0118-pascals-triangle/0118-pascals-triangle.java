class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 1) {
            result.add(Arrays.asList(1));
            return result;
        }
        if (numRows == 2) {
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1, 1));
            return result;
        }
        
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 1));
        
        for (int i = 2; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    list.add(1);
                } else {
                    int n1 = result.get(i - 1).get(j);
                    int n2 = result.get(i - 1).get(j - 1);
                    list.add(j, n1 + n2);
                }
            }
            list.add(i, 1);
            result.add(i, list);
        }
        return result;
    }
}