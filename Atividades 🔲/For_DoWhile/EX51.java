package FOR_e_DoWhile;

public class EX51 {
    public static void main(String[] args) {
    int a = 0;
    int n = 1;

    System.out.println("Os primeiros 10 números são:");
    do {
        int s = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (s == n) {
            System.out.println(n);
            a++;
        }
        n++;
    } while (a < 10);
}
}