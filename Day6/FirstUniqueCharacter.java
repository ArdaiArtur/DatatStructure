package Day6;

import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s="loveleetcode";
        firstUniqChar(s);
    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for (Character ch : s.toCharArray()) {
                
                    map.put(ch, map.getOrDefault(ch, 0) + 1);          
        }
        int i=0;
        for (var done : s.toCharArray()) {
            
            if(map.get(done)==1)
            return i;
            i++;
        }
        return -1;
    }
}
