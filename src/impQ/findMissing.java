package impQ;
//brute force approach-- do loops simultaneously ( nested )
// loop i from 0 to n , loop j same 0 to n
//outer loop i=0, first iteration checks the first element with all the elements if found , boolean changes to false and break
//but when seaches for i=2; it will not get in array hence found = false and !found=true and i is returned
public class findMissing {
    static void main(String[] args) {
        int [] arr={3,0,1,2,4}; // missing should be ?
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int [] arr){
        int n= arr.length;
        for(int i =0; i<=n;i++){
            boolean found = false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
}
