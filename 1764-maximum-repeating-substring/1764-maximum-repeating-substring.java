class Solution {
    public int maxRepeating(String sequence, String word) {
        int answer=0;

        String repeatWord =word;

        while(sequence.contains(repeatWord)){
            answer++;
            repeatWord +=word;
        }
                    

        return answer;
        
    }
}