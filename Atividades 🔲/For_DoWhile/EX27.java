package FOR_e_DoWhile;

public class EX27 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : array){
            sum += i;
        }

        System.out.println("A soma dos numeros é: " + sum);
    }
}
