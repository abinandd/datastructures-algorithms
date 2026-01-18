
public class CountDigit {

    public static int digitsCounter(int digit) {
        int count = 0;
        while (digit > 0) {
            digit /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int digit = 54123;
        int result = digitsCounter(digit);
        System.out.println("Digit count is " + result);

    }
}
