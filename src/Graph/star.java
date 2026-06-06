import java.util.LinkedList;

public class star {

    public static int optimizedFindMiddle(LinkedList<Integer>[]adj)
    {
        int center=-1;
        for(int i=0;i<adj.length;i++)
        {
            if(adj[i].size()>1)
                center=i;
        }
        return center;
    }

    public static int findMiddle(LinkedList<Integer>[]adj)
    {
        int center=-1;
        int maxDegree=-1;
        for(int i=0;i< adj.length;i++)
        {
            if(adj[i]!=null)
            {
                int degree=adj[i].size();
                if(degree>maxDegree)
                {
                    maxDegree=degree;
                    center=i;
                }
            }

        }

        return center;
    }


    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(4,2);
        //g.print();

        int center=star.findMiddle(g.getAdj());
        System.out.println("Center = "+center);

        int cen=star.optimizedFindMiddle(g.getAdj());
        System.out.println("Center = "+cen);

    }
}