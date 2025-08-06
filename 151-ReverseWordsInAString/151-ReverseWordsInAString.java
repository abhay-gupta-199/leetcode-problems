// Last updated: 8/6/2025, 11:04:22 AM
class Solution {
    public String reverseWords(String s) {
     s=s.trim();
     System.out.println(s);
     String[] arr=s.split(" +");
     String ans="";
     for(int i=arr.length-1;i>=0;i--){
        ans=ans+arr[i]+" ";
     }
     return ans.trim(); 
    }
}