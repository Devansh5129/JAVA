import java.util.*;
//brute-union
class unionintersectn{
    static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={3,4,5,6,7,8};
        System.out.println(union(arr1,arr2));
        System.out.println(intersection(arr1,arr2));
    }
    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return new ArrayList<>(set);
    }
        public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
            ArrayList<Integer> ans = new ArrayList<>();
            boolean[] visited = new boolean[arr2.length];
            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr2.length; j++) {
                    if(arr1[i] == arr2[j] && !visited[j]) {
                        ans.add(arr1[i]);
                        visited[j] = true;
                        break;
                    }
                }
            }
            return ans;
        }
    }
