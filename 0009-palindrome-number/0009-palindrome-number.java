class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        
        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        
        return x == reverse || x == reverse / 10;
    }
}
/*
 주어진 수 x가 회문이면 true 회문이 아니면 false를 반환하라
 edge case 
 1. 주어진 수 x가 음수라면 false를 반환
 2. 주어진 수의 마지막 수가 0이라면 false를 반환 0은 제외
 
 변수
 뒤집은수를 담을 변수
 
 x 가 reverse보다 크다면 로직을 반복
 주어진 수의 마지막 수를 가져온다.
 뒤집은수 = 뒤집은수 * 10 + 마지막 수
 주어진수 업데이트 #마지막수삭제
 x 
 
 만든 뒤집은 수와 주어진 수가 일치하는 지 비교
*/