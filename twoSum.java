import java.util.HashMap;
import java.util.Scanner;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k-arr[i])){
                result[1] = i;
                result[0] = map.get(k-arr[i]);
            }
            map.put(arr[i],i);
        }
        for(int i: result){
            System.out.print(result[i]+" ");
        }
    }
}
