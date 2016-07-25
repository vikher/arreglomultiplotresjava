package multiplodetre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Multiplodetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un numero");
            numeros[i] = input.nextInt();
        }
        System.out.println("Los numeros multiplos de 3 son " + Arrays.toString(Metodo(numeros)));
    }

    public static int[] Metodo(int[] arr) {

        List<Integer> tres = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 3 == 0) {
                tres.add(arr[i]);
            }

        }
        int[] result = new int[tres.toArray().length];
        Iterator it = tres.iterator();

        int count = 0;
        while (it.hasNext()) {
            result[count++] = (int) it.next();
        }
        return result;

    }
}
