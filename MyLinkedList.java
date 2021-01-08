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

  public void add(int index, String value){
    Node val = new Node(value);
    Node current = start;
    int boo = 0;

    if (size == index)  {
      add(value);
      boo = 1;
    }

    if (boo == 0) {
      for (int i = 0; i < size && current != null; i++) {
        if (i == index) {
          if (index == 0) {
            val.setNext(current);
            current.setPrev(val);
            start = val;
          } else {
            val.setNext(current);
            val.setPrev(current.getPrev());
            current.getPrev().setNext(val);
            current.setPrev(val);
          }
        } else {
          current = current.getNext();
        }
      }
      size++;
    }
  }

  public String get(int index) {
    Node current = start;
    for (int i = 0; i < size && current != null; i++) {
      if (i == index) {
        return current.getData();
      } else {
        current = current.getNext();
      }
    }
    return current.getData();
  }

  public String set(int index, String value) {
    Node current = start;

    for (int i = 0; i < size && current != null; i++) {
      if (i == index) {
        return current.setData(value);
      } else {
        current = current.getNext();
      }
    }

    return current.setData(value);
  }

  public String toString() {
    String ret = "[";
    Node current = start;
    while (current != null) {
      if (current.getNext() == null) {
        ret += current.getData() + "]";
      }
      else {
        ret += current.getData()+ ", ";
      }
      current = current.getNext();
    }
    return ret;
  }

 //Any helper method that returns a Node object MUST BE PRIVATE!
}
