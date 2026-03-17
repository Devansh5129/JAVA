package impQ;
class Qduplicate {
    static void main(String[] args) {
        int [] nums ={3,2,2,3};
        System.out.println( removeElement(nums,3));
        System.out.println( removeDuplicates(nums));
        System.out.println( removeDuplicates2(nums));
    }
    static int removeElement(int[] nums, int val) {
        int index = 0;
        for ( int i =0; i < nums.length; i++){
            if(val != nums[i]){
                nums[index]= nums[i];
                index++;
            }
        } return index;
    }
        static int removeDuplicates(int[] nums) {
            int n = nums.length;
            int j =1 ; // phla element fixed.
            //doosre se traverse
            for( int i=1; i<n; i++ ){
                if( nums[i]!= nums[j-1]){
                    nums[j]=nums[i];
                    j++;
                }}
            return j;
        }
    static int removeDuplicates2(int[] nums) {
        int n = nums.length;
        int j = 2; // phla element fixed.
        //doosre se traverse
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }}