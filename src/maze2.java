import java.util.*;
public class maze2 {
    public static void main(String[] args) {
        System.out.println(paths("", 2, 2));
    }
//poora process permutation(p,up) jaisa chal rha, last me path ko as a string return kara diya ...
    static ArrayList<String> paths(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        if(r > 1) {
            result.addAll(paths(p + "D", r - 1, c));
        }
        if(c > 1) {
            result.addAll(paths(p + "R", r, c - 1));
        }
        return result;
    }
}