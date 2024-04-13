import java.util.*;

public class MergeKSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            int size = scanner.nextInt();
            for (int j = 0; j < size; j++) {
                minHeap.add(scanner.nextInt());
            }
        }
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}