import java.util.*;
public class CycleDetection {
    private static Map<Integer, List<Integer>> graph;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        graph = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            addEdge(u, v);
        }
        if (hasCycle(N)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    private static void addEdge(int u, int v) {
        if (!graph.containsKey(u)) {
            graph.put(u, new ArrayList<>());
        }
        graph.get(u).add(v);
    }
    private static boolean hasCycle(int N) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> currentlyVisiting = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            if (dfs(i, visited, currentlyVisiting)) {
                return true;
            }
        }
        return false;
    }
    private static boolean dfs(int node, Set<Integer> visited, Set<Integer> currentlyVisiting) {
        if (currentlyVisiting.contains(node)) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        currentlyVisiting.add(node);
        if (graph.containsKey(node)) {
            for (int neighbor : graph.get(node)) {
                if (dfs(neighbor, visited, currentlyVisiting)) {
                    return true;
                }
            }
        }
        currentlyVisiting.remove(node);
        return false;
    }
}