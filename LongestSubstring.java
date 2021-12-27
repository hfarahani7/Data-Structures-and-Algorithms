//Returns longest substring without repeating characters 
import java.lang.StringBuilder;

class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        StringBuilder sb = new StringBuilder();
        
        if(s.length() < 2){
            return(s.length());
        }
        
        sb.append(Character.toString(s.charAt(0)));
        while(i < s.length() - 1){
            i++;
            if(sb.indexOf(Character.toString(s.charAt(i))) == -1){
                sb.append(Character.toString(s.charAt(i)));
            }else{
                while(sb.indexOf(Character.toString(s.charAt(i))) != -1){
                    sb.delete(0, 1);
                    j++;
                }
                sb.append(Character.toString(s.charAt(i)));
            }
            if(i - j + 1 > maxLength){
                maxLength = i - j + 1;
            }
        }
        return(maxLength);
    }
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
