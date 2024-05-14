package leecode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leecode_49 {
    public List<List<String>> groupAnagrams(String[] str)
    {
        
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(int i=0;i<str.length;i++){
            String str2=sortString(str[i]);
            hashMap.putIfAbsent(str2, new ArrayList<>());
            hashMap.get(str2).add(str[i]);
            
        }
        List<List<String>> final_list= new ArrayList<>(hashMap.values());
        return final_list;
    }
    private static String sortString(String str){
        char[] Arr1=str.toCharArray();
        Arrays.sort(Arr1);
        return new String(Arr1);
    }
    public static void main(String[] args) {
        String[] strings={"abc","bac","cba","def"};
        Leecode_49 leecode_49=new Leecode_49();
        System.out.println(leecode_49.groupAnagrams(strings));
    }
}
