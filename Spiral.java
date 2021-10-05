// Time Complexity : O(M x N)
// Space Complexity : O(M x N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Since it is matrix we can take 4 pointers and we can initialize them and then with the help of the pointers
// we can keep moving and we will be creating arraylist at start so we will adding the data according to setting
// the constraints on the 4 pointers.

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0 )
            return new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;

        //
        while(top <= bottom && left <= right){
            for(int x = left;x <=right;x++){
                output.add(matrix[top][x]);

            }
            top++;

            //2
            for(int x = top;x<=bottom;x++){
                output.add(matrix[x][right]);
            }
            right--;
            if(top <= bottom  && left <= right)
            {
                for(int x = right; x >= left;x--){
                    output.add(matrix[bottom][x]);
                }
                bottom--;

                //3

                for(int x = bottom;x>=top;x--){
                    output.add(matrix[x][left]);
                }
                left++;
            }
        }
        return output;



    }
}

// S30 Approach
// === checks the type of the data.
