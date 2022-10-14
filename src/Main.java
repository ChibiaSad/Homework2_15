import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerListImpl(randomInt(10000));
//        Integer[] ints1 = randomInt(100000);
//        Integer[] ints2 = Arrays.copyOf(ints1, ints1.length);
//        Integer[] ints3 = Arrays.copyOf(ints1, ints1.length);

//        System.out.println("\nstart:");

//        long start = System.currentTimeMillis();
//        sortBubble(ints1);
//        System.out.println("Пузырек: " + (System.currentTimeMillis() - start));

//        start = System.currentTimeMillis();
//        sortSelection(ints2);
//        System.out.println("Выбор:   " + (System.currentTimeMillis() - start));
//
//        start = System.currentTimeMillis();
//        sortInsertion(ints3);
//        System.out.println("Вставка: " + (System.currentTimeMillis() - start));

//        System.out.println("end");
    }

    public static Integer[] randomInt(int length) {
        Integer[] ints = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(10000);
        }
        return ints;
    }

    public static void sortBubble(Integer[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int tpm = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tpm;
                }
            }
        }
    }

    private static void sortSelection(Integer[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < ints[minIndex]) {
                    minIndex = j;
                }
            }
            int tpm = ints[minIndex];
            ints[minIndex] = ints[i];
            ints[i] = tpm;
        }
    }

    private static void sortInsertion(Integer[] ints) {
        for (int i = 1; i < ints.length; i++) {
            Integer curr = ints[i];
            int j = i;
            while (j > 0 && ints[j - 1] >= curr) {
                ints[j] = ints[j - 1];
                j--;
            }
            ints[j] = curr;
        }
    }
}