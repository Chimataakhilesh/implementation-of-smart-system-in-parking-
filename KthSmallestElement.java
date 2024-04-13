import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(scanner.nextInt());
        }
        int kthSmallest = findKthSmallest(pq, K);
        System.out.println(kthSmallest);
    }
    private static int findKthSmallest(PriorityQueue<Integer> pq, int K) {
        if (K > pq.size()) {
            return -1; 
        }
        while (K > 1) {
            pq.poll();
            K--;
        }
        return pq.peek();
    }
}