package leecode;

import java.util.Arrays;
import java.util.HashMap;

public class HSMap {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        
        for (int a = 0; a < nums.length; a++) {
            if (hashMap.containsKey(target - nums[a])&&hashMap.get(target-nums[a])!=a) {
                result[0] = a;
                result[1] = hashMap.get(target - nums[a]);
                break; // 找到结果后直接退出循环
            }
        }
        
        return result;
    }
    

    
    public static void main(String[] args) {
        HSMap hsMap = new HSMap();
        int[] result = hsMap.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
    }
}
