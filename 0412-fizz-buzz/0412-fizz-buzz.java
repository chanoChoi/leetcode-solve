class Solution {
    public List<String> fizzBuzz(int n) {
        String FIZZBUZZ = "FizzBuzz";
        String FIZZ = "Fizz";
        String BUZZ = "Buzz";
        
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add(FIZZBUZZ);
            } else if (i % 3 == 0) {
                result.add(FIZZ);
            } else if (i % 5 == 0) {
                result.add(BUZZ);
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}