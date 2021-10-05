// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english
// Created two arrays left and right and initialized the first element of left as 0 and last element of right as 1.
// Then we store the product of all the values from left to right in the left array and vice versa
// Finally we also create a ouput array in which multiply all the element from left array and right array and it will
// give me the output.

class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Using Extra Space
//         if(nums == null && nums.length == 0)
//             return new int[]{-1};
//        int n = nums.length;
//         int[] left = new int[n];
//         int[] right = new int[n];
//         int[] output = new int[n];

//         left[0] = 1;
//         right[n-1] = 1;

//         for(int i = 1;i<n; i++){
//             left[i] = nums[i-1] * left[i-1];
//         }
//          for(int i = n-2;i>=0; i--){
//             right[i] = nums[i+1] * right[i+1];
//         }
//         for(int i = 0;i<n;i++){
//             output[i] = left[i] * right[i];
//         }

//         return output;
        // INPLACE APPROACH
        if(nums == null && nums.length == 0)
            return new int[]{-1};
        int n = nums.length;

        int[] output = new int[n];
        output[0] = 1;
        for(int i = 1;i<n;i++){
            output[i] = nums[i-1] * output[i-1];
        }


        int R = 1;
        for(int i = n-1;i>=0; i--){
            output[i] = output[i] * R;
            R = R * nums[i];
        }


        return output;





    }
}

// Your code here along with comments explaining your approach