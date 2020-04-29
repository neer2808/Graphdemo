import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class MyGraph {
  ArrayList<GraphNode> arr[];
  public MyGraph(int n) // represents size
  {
    arr = new ArrayList[n];
    for(int i =0;i<arr.length;i++)
    {
      arr[i] = new ArrayList<GraphNode>();
    }
  }
  public void addundirectedEdge(int start, int end)
  {
    arr[start].add(new GraphNode((end)));

  }

  @Override
  public String toString() {
    return "MyGraph{" +
            "arr=" + Arrays.toString(arr) +
            '}';
  }
}
