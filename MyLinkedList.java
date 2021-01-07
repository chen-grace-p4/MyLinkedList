public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String value) {
    Node val = new Node(value);

    if (size == 0) {
      start = val;
      end = val;
    } else {
      end.setNext(val);
      val.setPrev(end);
      end = val;
    }

    size++;
    return true;
  }

  // public void add(int index, String value);
  //
  // public String get(int index);
  //
  // public String set(int index, String value);
  //
  public String toString() {
    String ret = "[";
    Node current = start;
    while (current != null) {
      ret += current.getData() + ", ";
      current = current.getNext();
    }
    ret += "]";
    return ret;
  }

 //Any helper method that returns a Node object MUST BE PRIVATE!
}
