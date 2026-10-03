class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder build = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            if((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            build.append(Character.toLowerCase(s.charAt(i)));
        }
       
    int left = 0;
    int right = build.length()-1;
    while(left < right){
    if(build.charAt(left) != build.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
  }
}
