class Solution {
    public boolean squareIsWhite(String coordinates) {
        String[] array = coordinates.split("");
        Boolean answer = true;
        
        if(Integer.parseInt(array[1])%2==0){
            if(array[0].equals("a")){
                answer = true;
            }else if(array[0].equals("c")){
                answer = true;
            }else if(array[0].equals("e")){
                answer = true;
            }else if(array[0].equals("g")){
                answer = true;
            }else{
                answer = false;
            }
        }else if(Integer.parseInt(array[1])%2==1){
            if(array[0].equals("b")){
                answer = true;
            }else if(array[0].equals("d")){
                answer = true;
            }else if(array[0].equals("f")){
                answer = true;
            }else if(array[0].equals("h")){
                answer = true;
            }else{
                answer = false;
            }
        }
        return answer;
    }
}