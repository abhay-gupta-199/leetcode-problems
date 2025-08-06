// Last updated: 8/6/2025, 11:04:42 AM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] ar = new int[matrix[0].length];
        int ans = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '0') {
                    ar[j] = 0;
                } else {
                    ar[j]++;
                }
            }
            ans = Math.max(ans, largestRectangleArea(ar));
        }
        return ans;
    }
    public static int largestRectangleArea(int[] arr) {
       Stack<Integer> st=new Stack<>();
       int ans=0;
       for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    ans=Math.max(h*r,ans);
                }else{
                    int l=st.peek();
                    int area=h*(r-l-1);
                    ans=Math.max(area,ans);
                }
            }
            st.push(i);
       }   
       int r=arr.length;
       while(!st.isEmpty()){
        int h=arr[st.pop()];

        if(st.isEmpty()){
            ans=Math.max(h*r,ans);
        }else{
            int l=st.peek();
            int area=h*(r-l-1);
            ans=Math.max(area,ans);
        }
       }
       return ans;
    }
}