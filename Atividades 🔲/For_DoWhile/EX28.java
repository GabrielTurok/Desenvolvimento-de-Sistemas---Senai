package FOR_e_DoWhile;

public class EX28 {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5};
        int s = 0;

        for (int i : ar){
            s += i;
        }

        double b = (double) s / ar.length;
        System.out.println("A media dos numeros é:"+b);
    }
}
