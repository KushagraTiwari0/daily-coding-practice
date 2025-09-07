import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

   public static void bfs(int src, int v, LinkedList<Integer>[]adj)
    {
        boolean visited[]=new boolean[v];
        LinkedList<Integer> q=new LinkedList<>();
        q.addLast(src);
        visited[src]=true;
        while(!q.isEmpty())
        {
            int node=q.removeFirst();
            System.out.println(node);
            Iterator<Integer>it=adj[node].listIterator();
            while (it.hasNext())
            {
                int nbr= it.next();
                if(!visited[nbr]) {
                    visited[nbr] = true;
                    q.addLast(nbr);
                }

            }
        }

    }



}
