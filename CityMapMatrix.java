import java.util.*;

public class CityMapMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCities = scanner.nextInt();
        scanner.nextLine();
        String[] cityNames = new String[numCities];
        for (int i = 0; i < numCities; i++) {
            cityNames[i] = scanner.nextLine().trim();
        }
        int[][] adjacencyMatrix = new int[numCities][numCities];
        for (int i = 0; i < numCities; i++) {
            Arrays.fill(adjacencyMatrix[i], 0);
        }
        int numLinks = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numLinks; i++) {
            String[] link = scanner.nextLine().split(" ");
            int city1Index = Arrays.asList(cityNames).indexOf(link[0]);
            int city2Index = Arrays.asList(cityNames).indexOf(link[1]);
            adjacencyMatrix[city1Index][city2Index] = 1;
            adjacencyMatrix[city2Index][city1Index] = 1;
        }
        System.out.print(" ");
        for (String cityName : cityNames) {
            System.out.print(cityName + " ");
        }
        System.out.println();
        for (int i = 0; i < numCities; i++) {
            System.out.print(cityNames[i] + " ");
            for (int j = 0; j < numCities; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
