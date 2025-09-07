import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

   public static void bfs(int src, int v, LinkedList<Integer>[]adj)
    {
        boolean visited[]=new boolean[v];
        LinkedList<Integer> q=new LinkedList<>();
        int dist[]=new int[v];


        for (int i = 0; i < v; i++) {
            dist[i] = -1;
        }
        dist[src]=0;
        q.addLast(src);
        visited[src]=true;
        while(!q.isEmpty())
        {
            int node=q.removeFirst();
            //System.out.println(node);
            Iterator<Integer>it=adj[node].listIterator();
            while (it.hasNext())
            {
                int nbr= it.next();
                if(!visited[nbr]) {
                    visited[nbr] = true;
                    dist[nbr]=1+dist[node];
                    q.addLast(nbr);
                }

            }

            }
            for (int i=0;i<v;i++)
                System.out.println("Node  "+i+"  Distance "+dist[i]);


    }



}
