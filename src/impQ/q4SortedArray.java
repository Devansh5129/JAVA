package impQ;

public class q4SortedArray {
    public static void main(String[] args ) {
        int [] a={1,2,4,5};
        System.out.println(sorted(a,0));
    }
    static boolean sorted(int[]a,int index){
        //base condition
        if(index==a.length-1){
            return true;
        }
        return a[index]<a[index+1]&& sorted(a,index+1);

    }
}
