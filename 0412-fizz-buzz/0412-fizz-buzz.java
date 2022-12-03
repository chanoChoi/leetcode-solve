class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        // 1부터 주어진 수 까지 반복
        for (int i = 1; i <= n; i++){
        // 수를 3 또는 5 나누었을 떄 나머지가 0 이면 "FizzBuzz"를 배열에 삽입
            if (i % 3 == 0 && i % 5 == 0) answer.add("FizzBuzz");
        // 수를 3으로 나누었을 때 나머지가 0 이면 "Fizee"를 배열에 삽입
            else if (i % 3 == 0)answer.add("Fizz");
        // 수를 5로 나우었을 때 나머지가 0 이면 "Buzz"를 배열에 삽입
            else if (i % 5 == 0) answer.add("Buzz");
//          위 조건들을 만족하지 않는 수는 숫자를 배열에 삽입
            else answer.add(String.valueOf(i));
        }
        return answer;
    }
}