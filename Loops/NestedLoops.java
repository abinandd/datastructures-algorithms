
public class NestedLoops {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "from the i block");
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
            }
        }
    }
}
