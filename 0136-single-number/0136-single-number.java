class Solution {
    public int singleNumber(int[] nums) {
        // set TC = O(n) SC = O(n)
//         xor TC = O(n) SC = O(1)
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        return set.iterator().next();
        
        // **중복체크**를 위한 주머니 생성(set 자료구조를 사용) 
        // 주어진 배열을 순회하며 배열내의 수를 조회한다.
        // 중복체크 주머니내에 수가 존재하지 않는다면 체크용 주머니에 삽입
        // 중복체크주머니내에 수가 존재한다면 답 주머니에 삽입
        
        // 중복체크 주머니와 답 주머니의 차집합을 구한다.
    }
}