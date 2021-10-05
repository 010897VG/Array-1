// Time Complexity :o(n);
// Space Complexity :o(m*n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : No



class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if((mat==null)||(mat.length==0)||(mat[0].length==0)){
            return null;
        }
        int n=mat.length;
        int m=mat[0].length;
        int[] output =new int[m*n];
        int dir=1;
        int index=0;
        int start=0;
        int end=0;
        while(index<m*n){
            output[index]=mat[start][end];
            index=index+1;
            if(dir==1){
                if(end==m-1){
                    dir=-1;
                    start++;


                }
                else if(start==0){
                    dir=-1;
                    end++;

                } else{
                    start--;
                    end++;
                }
            }else{
                if(start==n-1){
                    dir=1;
                    end++;

                }
                else if(end==0){

                    dir=1;
                    start++;

                } else{
                    start++;
                    end--;
                }
            }


        }





        return output; }
}