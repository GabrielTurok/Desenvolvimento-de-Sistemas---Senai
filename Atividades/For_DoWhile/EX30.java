package FOR_e_DoWhile;

public class EX30 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int par = 0;
        int impar = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Números pares: " + par);
        System.out.println("Números ímpares: " + impar);
    }
}