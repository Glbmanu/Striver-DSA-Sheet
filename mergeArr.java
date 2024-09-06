import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mergeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            ar.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            ar.add(arr2[i]);
        }
        Integer a[] = ar.toArray(new Integer[ar.size()]);
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
