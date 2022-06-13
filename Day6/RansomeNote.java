package Day6;

public class RansomeNote {
    public static void main(String[] args) {
        
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
       
        char[]off=new char[128];
        
        
        for (int i = 0; i < magazine.length(); i++) {
            off[magazine.charAt(i)]++;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            if(off[ransomNote.charAt(i)]<=0)
            return false;
            off[ransomNote.charAt(i)]--;
        }
        return true;
    }
}
