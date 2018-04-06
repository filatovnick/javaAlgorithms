// 202. Happy Number (easy)
// Write an algorithm to determine if a number is "happy".
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits,
// and repeat the process until the number equals 1 (where it will stay),
// or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy numbers.
// Example:
// 1^2 + 9^2 = 82
// 8^2 + 2^2 = 68
// 6^2 + 8^2 = 100
// 1^2 + 0^2 + 0^2 = 1
// So, 19 is Happy number


import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    static public void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        int num = 19;
        System.out.println(happyNumber.isHappy(num));
    }

    public boolean isHappy(int n) {
        Set<Integer> isHappySet = new HashSet<Integer>();
        if(n==1){
            return true;
        }
        int sum = 0;
        while(n>0) {
            int digit = n % 10;
            n /= 10;
            sum = sum + digit * digit;
        }
        if(isHappySet.contains(sum)){
            return false;
        }
        isHappySet.add(sum);
        return isHappy(sum);
    }
}