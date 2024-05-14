package leecode.hash;
import java.util.HashSet;
public class leecode_128 {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> numSet = new HashSet<>();
      
        for(int num:nums){
            numSet.add(num);
        }
        int longestlength=0;
       for(int num:nums){
        if (!numSet.contains(num-1)) {
            int currentnum=num;
            int currentlenth=1;
            while (numSet.contains(currentnum+1)) {
                currentlenth++;
                currentnum++;
            }
            longestlength=Math.max(currentlenth, longestlength);
        }
       
       }
       return longestlength;
    }
    public static void main(String[] args) {
        leecode_128 leecode_128=new leecode_128();
        System.out.println(leecode_128.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
