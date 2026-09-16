public class GraphMatrix {
    public static void main(String[] args) {
        int[][] graph = new int[5][5];
        graph[0][1] = 1;
        graph[0][4] = 1;
        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[1][3] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;
        graph[3][1] = 1;
        graph[3][2] = 1;
        graph[3][4] = 1;
        graph[4][0] = 1;
        graph[4][3] = 1;

        System.out.println("Graph represented as an adjacency matrix:");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
