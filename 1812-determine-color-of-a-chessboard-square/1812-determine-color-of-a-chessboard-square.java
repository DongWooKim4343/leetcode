class Solution {
    public boolean squareIsWhite(String coordinates) {
        int alphabet = coordinates.charAt(0)-'a';
        int num = coordinates.charAt(1);

        if(alphabet % 2 ==0 && num%2 ==0){
            return true;
        }else if(alphabet % 2 ==1 && num%2 ==1){
            return true;
        }else{
            return false;
        }

    }
}