public class Solution {
    public boolean isAnagram(String s, String t) {

        if (s==null||t==null) return false;
        if (s.length()!=t.length()) return false;

        char[] newS=s.toCharArray();
        char[] newT=t.toCharArray();
        Arrays.sort(newS);
        Arrays.sort(newT);

        s=new String(newS);
        t=new String(newT);

        return s.equals(t);        
    }
}
