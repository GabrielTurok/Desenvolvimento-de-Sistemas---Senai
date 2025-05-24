package FOR_e_DoWhile;

public class EX53 {
    public static void main(String[] args) {
    int c = 1;
    int s = 0;

    System.out.println("Sequência de números triangulares até o décimo termo:");
    do {
        s += c;
        System.out.println(s);
        c++;
    } while (c <= 10);
}
}