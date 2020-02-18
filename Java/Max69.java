
class Solution {
    public int maximum69Number (int num) {
        
        String strNum = Integer.toString(num);
        char [] ch = strNum.toCharArray();
        for(int i = 0; i < ch.length; ++i){
            if(ch[i] == '6'){
                ch[i] = '9';
                String sec = new String(ch);
                return Integer.parseInt(sec);
            }
        }
        return num;
    
    }
}