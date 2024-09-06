import java.util.Arrays;
import java.util.Scanner;

public class missAndrRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int hash[] = new int[n+1];
       // Arrays.fill(hash,0);
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        int miss = -1;
        int rep = -1;
        for (int i = 1; i <= n; i++) {
            if(hash[i]==0){
                miss = i;
            } else if (hash[i]>1) {
                rep = i;
            }
        }
        System.out.print(miss+" ");
        System.out.print(rep);
    }
}
