import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
    
        String answer="";
        int index=0;

        for(int i =0; i<tArr.length; i++){
        
            if(index<sArr.length){
                if(tArr[i].equals(sArr[index])){
                    answer+=sArr[index++];  
                }
                
            }
            
        }
        
        System.out.println(answer);

        

        return answer.equals(s);
    }
}