public class MaximalNetworkRank {

    public static int maxRank(int n,int[][] roads)
    {
        int[] degree = new int[n]; // store degree (number of roads per city)
        boolean[][] connected = new boolean[n][n]; // direct connection check

        // Build degree array and connection matrix
        for (int[] road : roads) {
            int u = road[0], v = road[1];
            degree[u]++;
            degree[v]++;
            connected[u][v] = true;
            connected[v][u] = true;
        }

        int maxRank = 0;

        // Check all pairs (i, j)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = degree[i] + degree[j];
                if (connected[i][j]) {
                    rank--; // subtract one if they are directly connected
                }
                maxRank = Math.max(maxRank, rank);
            }
        }

        return maxRank;
    }




    public static void main(String[] args) {
        graph g=new graph(4);
        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(1,3);
        int [][]arr=graph.convertToArray(g.getAdj());

        int count=maxRank(4,arr);
        System.out.println(count);

    }
}
