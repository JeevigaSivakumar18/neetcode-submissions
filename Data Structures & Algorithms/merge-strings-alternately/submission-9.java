class Solution {
    public String mergeAlternately(String w1, String w2) {
        int left = 0;
        int right = 0;
        StringBuilder build = new StringBuilder();
        while(left <= w1.length()-1 && right <= w2.length()-1){
               build.append(w1.charAt(left));
               build.append(w2.charAt(right));
               left++;
               right++;
        }
        System.out.println(left);
        System.out.println(right);
        //System.out.print("1 :"+build);
        if(left != w1.length()){
            String ans = w1.substring(left , w1.length());
            build.append(ans);
        }
        //System.out.print("2 :"+build);
        if(right != w2.length()){
            String ans = w2.substring(right , w2.length());
            System.out.print(ans);
            build.append(ans);
        }
        //System.out.print("3 :"+build);
        return build.toString();
    }
}