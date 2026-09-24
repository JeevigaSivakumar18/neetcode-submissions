class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];
            if(num != '.'){
                String rr = num +" is in "+ i + "r";
                String cc = num +" is in "+ j + "c";
                String rc = num +" is in box "+i/3+ " , "+j/3 + "box";

                if(set.contains(rr)||set.contains(cc)||set.contains(rc)){
                    return false;
                }
                set.add(rr);
                set.add(cc);
                set.add(rc);
            }else{
                continue;
            }
        }
        }
        return true;
    }
}
