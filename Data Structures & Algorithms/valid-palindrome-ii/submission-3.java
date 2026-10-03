class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder build = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            int ch = s.charAt(i);
            if((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                build.append(s.charAt(i));
            }
        }
        int flag = 0;
        int left = 0;
        int right = build.length()-1;
        while(left < right && flag == 0){
            if(build.charAt(left) != build.charAt(right)){
                 flag = 1;
            }
            left++;
            right--;
        }
        if(flag == 0){
            return true;
        }else{
            int ptr = 0;
            while(ptr < build.length()){
                int flag1= 0;
                StringBuilder bul = new StringBuilder(build);
                bul.deleteCharAt(ptr);
                //System.out.println(bul.toString());
                left = 0;
                right = bul.length()-1;
            while(left < right){
                if(bul.charAt(left) != bul.charAt(right)){
                    flag1= 1;
                }
                left++;
                right--;
            }
            ptr++;
            if(flag1 == 0){
                return true;
            }
         }
        }
    return false;
    }
}