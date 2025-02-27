import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer =0;
        int tPointer =0;

        for(int i =0; i<t.length(); i++){
            if(sPointer<s.length() && tPointer<t.length()){
                
                if(t.charAt(tPointer)==s.charAt(sPointer)){
                    sPointer++;
                }
                tPointer++;
            }
            
        }
        return sPointer==s.length();
    }
}