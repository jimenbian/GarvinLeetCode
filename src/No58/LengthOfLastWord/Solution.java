package No58.LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        char[] chars=s.toCharArray();
        char empty=' ';
        int lengthOfLastWord=0;
        int lengthOfLastWord_temp=0;
        for(int i=0;i<s.length();i++){
            if(chars[i]!=empty){
                lengthOfLastWord++;
                 lengthOfLastWord_temp=lengthOfLastWord;
            }
            else {
               
                lengthOfLastWord=0;
            }
        }
        if(chars[s.length()-1]==empty) return lengthOfLastWord_temp;
        else  return lengthOfLastWord;
    }
}