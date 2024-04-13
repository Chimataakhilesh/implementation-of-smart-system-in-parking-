import java.util.Scanner;

public class MajesticArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        if (isMajestic(array)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    private static boolean isMajestic(int[] array) {
        if (array.length < 6) {
            return false;
        }

        int sumFirstThree = array[0] + array[1] + array[2];
        int sumLastThree = array[array.length - 1] + array[array.length - 2] + array[array.length - 3];

        return sumFirstThree == sumLastThree;
    }
}