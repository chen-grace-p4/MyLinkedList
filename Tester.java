public class Tester{
  public static void main(String[]args) {
    MyLinkedList test = new MyLinkedList();

    test.add("one");
    test.add("two");
    test.add("four");
    test.add(2, "three");
    System.out.println(test);
  }
}
