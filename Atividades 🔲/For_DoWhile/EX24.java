package FOR_e_DoWhile;

public class EX24 {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            int triangularNumber = n * (n + 1) / 2;
            System.out.println(triangularNumber);
        }
    }
}