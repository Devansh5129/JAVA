package impQ;
import java.util.*;
class Qjump {
    static void main(String[] args) {
        int []nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }
    static int jump(int[] nums) {
        int n =nums.length;
        int jumps=0;
        int end=0;//this will give count of jumps...
        int farthest=0;
        for(int i=0; i<n-1; i++){
            farthest=Math.max(farthest, nums[i]+i);
            if(farthest>=n-1){
                jumps++;
                return jumps;
            }
            if(i==end){
                jumps++;
                end=farthest;
            }
        }return jumps;
    }
}