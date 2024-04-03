import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите размер");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            temp[i] = t;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);


        }
    }
}