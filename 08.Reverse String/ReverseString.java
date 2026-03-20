import java.util.Arrays;
public class ReverseString {

    public static void main(String[] args) {
        String[] s = {"h", "e", "l", "l", "o"};

        int len = s.length;
        //taking the halflength
        int halflen = (int) Math.floor(len / 2);

        // looping through half length
        for (int i = 0; i < halflen; i++) {
            //swaping logic 1.moving first value into temp, 2. moving last value into first, 3. moving temp into last
            String temp = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(s));

    }
}
