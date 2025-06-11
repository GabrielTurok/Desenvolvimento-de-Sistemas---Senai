package FOR_e_DoWhile;

public class EX38 {
    public static void main(String[] args) {
    int i = 1;
    do {
        if (i % 2 != 0) {
            System.out.println(i);
        }
        i++;
    } while (i <= 20);
}
}