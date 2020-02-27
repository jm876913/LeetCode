class Solution {
    public int numJewelsInStones(String J, String S) {
        int stonecount = 0;
        char Sarr[] = new char[S.length()];
        char Jarr[] = new char[J.length()];
        for(int i = 0; i < S.length(); i ++){
            Sarr[i] = S.charAt(i);
            for(int j = 0; j < J.length(); j++){
                Jarr[j] = J.charAt(j);
                if(Sarr[i] == Jarr[j]){
                    stonecount++;
                }
            }
            
        }
        return stonecount;
    }
}