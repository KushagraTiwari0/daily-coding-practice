import java.util.*;
public class cityGraph {

    private LinkedList<String>[] nbrs;
    private Map<String,Integer> cityIndex;

    public cityGraph(List<String> cities)
    {
        int n=cities.size();
        this.nbrs=new LinkedList[n];
        this.cityIndex=new HashMap<>();
        for(int i=0;i<n;i++) {
            this.nbrs[i] = new LinkedList<>();
            cityIndex.put(cities.get(i), i);
        }
    }

    public void addCEdge(String city1,String city2)
    {
        int index1=cityIndex.get(city1);
        int index2=cityIndex.get(city2);
        nbrs[index1].add(city2);
        nbrs[index2].add(city1);
    }

    public void print(List<String> cities)
    {
        for(int i=0;i<nbrs.length;i++)
            System.out.println(cities.get(i)+" -> "+nbrs[i]);
    }


    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Lucknow","Jalandhar","Kanpur","Delhi");
        cityGraph g=new cityGraph(cities);
        g.addCEdge("Lucknow","Kanpur");
        g.addCEdge("Kanpur","Delhi");
        g.addCEdge("Delhi","Jalandhar");
        g.addCEdge("Jalandhar","Lucknow");
        g.print(cities);
    }



}
