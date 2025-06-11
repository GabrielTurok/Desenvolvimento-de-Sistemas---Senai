package FOR_e_DoWhile;

import java.util.Random;

public class EX49 {
        public static void main(String[] args) {
        Random random = new Random();
        String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder p = new StringBuilder();
        int length = 6;
        int i = 0;

        do {
            int index = random.nextInt(c.length());
            p.append(c.charAt(index));
            i++;
        } while (i < length);

        System.out.println("Senha gerada: " + p.toString());
    }
}