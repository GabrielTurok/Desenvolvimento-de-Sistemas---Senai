package FOR_e_DoWhile;

public class EX52 {
    public static void main(String[] args) {
    int C = 0;
    int n = 2;

    System.out.println("Os primeiros 10 números primos são:");
    do {
        boolean p = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                p = false;
                break;
            }
        }
        if (p) {
            System.out.println(n);
            C++;
        }
        n++;
    } while (C < 10);
}
}