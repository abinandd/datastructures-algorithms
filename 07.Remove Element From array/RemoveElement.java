// 27.Remove Element - Leetcode 

public class RemoveElement {

    //function for removing the element
    public static int removeElement(int[] nums, int val) {
        
        int k = 0;
        //iterating through all the elemtns
        for (int i = 0; i < nums.length; i++) {
            //only replacing values that are equal to the target value
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        // k elements are 4,2,2 if removing the 3 from all the places 
        int[] nums = {3, 4, 3, 2, 2};
        int val = 3;
        int k = removeElement(nums, val);
        System.err.println(k);
    }

}
