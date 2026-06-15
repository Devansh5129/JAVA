package impQ;
//moore-voting algo--states that selecting one element from the array and if it
//appears more then ++ , otherwise --.
public class majorityElement {
    static void main(String[] args) {
        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        System.out.println("majority occuring element : "+appear(arr));
    }
    public static int appear(int[] arr) {
        int count = 0;
        int ele=0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        int count1=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==ele){
                count1++;
            }
            if(count1>arr.length/2){
                return ele;
            }
        }return -1;
    }
}

