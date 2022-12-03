class Solution {
    public int reverse(int x) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int reverse = 0;
        
        while (x != 0) {
            int lastDigit = x % 10;
            if (reverse > max / 10 || (reverse == max / 10 && lastDigit > 7)) return 0;
            if (reverse < min / 10 || (reverse == min / 10 && lastDigit < -8)) return 0;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        
        return reverse;
    }
}

// 숫자를 뒤집는데 뒤집어서 만드는 수가 2^31 - 1 보다 크거나 -2^31 보다 작으면 0을 반환

// 비교용 MAX_VALUE
// 비교용 MIN_VALUE
// 반환할 뒤집은 수;

// 주어진 x가 0아니라면 특정 로직을 반복
// 주어진 수의 가장 마지막 자리의 수를 가져온다. 모듈러
// 현재 만들어진 뒤집은 수가 MAX의 뒷자리를 제외한 수보다 크다면 뒤에 어떤 수가 오던지 범위를 넘게된다 return 0
// 현재 만들어진 뒤집은 수가 MAX의 뒷자리를 제외한 수와 같다면 마지막 수인 7 보다 크면 범위를 넘게된다 return 0

// 현재 만들어진 뒤집은 수가 MIN의 뒷자리를 제외한 수보다 작다면 뒤에 어떤 수가 오던지 범위를 넘게된다 return 0
// 현재 만들어진 뒤집은 수가 MIN의 뒷자리를 제외한 수와 같다면 MIN의 마지막 수인 -8 보다 작다면 범위를 넘게된다 R 0

// 뒤집은 수 = 뒤집은 수 * 10 + 마지막 자리의 수
// 주어진 수를 업데이트 #마지막수제거