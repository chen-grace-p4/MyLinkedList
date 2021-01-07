public class Node {
  private String data;
  private Node next,prev;

  public Node(String value){
    data = value;
  }

  public String setData(String s) {
    String ret = data;
    data = s;
    return ret;
  }
  public String getData() {
    return data;
  }

  public Node setNext(Node n) {
    Node ret = next;
    next = n;
    return ret;
  }
  public Node getNext() {
    return next;
  }

  public Node setPrev(Node n) {
    Node ret = prev;
    prev = n;
    return ret;
  }
  public Node getPrev() {
    return prev;
  }
 //write get/set methods for all three instance variables.

}
