public class GraphMain {


    public static void main(String[] args) {
        graph g=new graph(6);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(2,1);
        g.addEdge(3,4);
        g.addEdge(4,5);
        g.addEdge(2,3);
        g.addEdge(3,5);
        BFS.bfs(0,6,g.getAdj());



    }


}
