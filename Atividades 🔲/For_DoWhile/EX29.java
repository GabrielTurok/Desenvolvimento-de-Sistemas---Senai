package FOR_e_DoWhile;

public class EX29 {
    public static void main(String[] args) {

        int[] array = {5,2,9,1,5,6};

        for (int i = 0; i < args.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < args.length;j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int t = array[min];
            array[min] = array[min];
            array[i] = t;
        }

        System.out.println("Lista ordenada!");
        for (int n : array){
            System.out.println(n + " ");
        }
    }
}
