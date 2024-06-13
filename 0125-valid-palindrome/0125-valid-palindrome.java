class Solution {
    public boolean isPalindrome(String s) {
        String b=s.toLowerCase();
        b=b.replaceAll("\\s+", "");
        b=b.replaceAll("\\p{Punct}", "");
        // boolean ans=false;
        int i=0;
        int j=b.length()-1;
        while(i<j){
            if(b.charAt(i) != b.charAt(j))  return false;
            i++;
            j--;   
        }
        return true;
    }
}
    
    
