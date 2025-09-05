import java.util.*;
public class graph {
    private LinkedList<Integer>[] adj;

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public graph(int vertices)
    {
        adj=new LinkedList[vertices];
        for(int i=0;i<vertices;i++)
            adj[i]=new LinkedList<>();
    }

    public void addEdge(int src,int dest)
    {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public void print()
    {
        for(int i=0;i<adj.length;i++)
            System.out.println(i+" --> "+adj[i]);
    }

    public static void main(String args[])
    {
        graph g=new graph(6);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(2,1);
        g.addEdge(3,4);
        g.addEdge(4,5);
        g.addEdge(2,3);
        g.addEdge(3,5);
        g.print();
    }

}
