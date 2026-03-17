
public class RemoveDuplicates {

    public static int removeDuplicate(int[] nums) {
        //pointing to the first element
        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            // using this condition for getting the unique element
            if (nums[x] != nums[i]) {
                // updating the index for updating the value
                x++;
                nums[x] = nums[i];
            }
        }
        return x+1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicate(nums);
        System.err.println(k);
    }
}
