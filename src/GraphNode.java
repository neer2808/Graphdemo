public class GraphNode {
  // we can modify it according to our requirement
  int value;
  public GraphNode(int value)
  {
    this.value = value;
  }

  @Override
  public String toString() {
    return value+ " ";
  }
}
