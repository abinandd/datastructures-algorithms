
public class PalindromeNumber {

    public boolean isPalindrome(int num) {
        //controlling negative numbers
        num = Math.abs(num);

        //creating a copy of original value
        int numCopy = num;
        int rev = 0;

        //loop runs until number becomes 0
        while (num > 0) {
            //storing last digit
            int rem = num % 10;
            //storing removed number into rev variable and avoiding overridign of value using multiply by 10
            rev = (rev * 10) + rem;
            // removing last digit by division using 10
            num /= 10;
        }
        //returns true or false based on condition 
        return numCopy == rev;
    }

    public static void main(String[] args) {

        PalindromeNumber check = new PalindromeNumber();
        int num = -121;
        boolean result = check.isPalindrome(num);
        System.out.println(result);

    }
}
