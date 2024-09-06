import java.util.Scanner;

public class ReversePairs {
    public static int team(int []skill, int n){
        // Write your code here.
        int count = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<=n-1; j++){
                if(skill[i]>(2*skill[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(team(arr, n));
    }
}
