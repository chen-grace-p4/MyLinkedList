public class Tester{
  public static void main(String[]args) {
    MyLinkedList test = new MyLinkedList();

    test.add("one");
    test.add("two");
    test.add("four");
    test.add(2, "three");
    test.add(0, "zero");
    test.add(5, "five");
    System.out.println(test);
    // System.out.println(test.size());

    // MyLinkedList test2 = new MyLinkedList();
    // test2.add("six");
    // test2.add("seven");
    // test2.add("eight");
    // System.out.println(test2);
    //
    // test.extend(test2);
    // System.out.println(test);
    // System.out.println(test.size());
    // System.out.println(test2);
    // System.out.println(test2.size());

    MyLinkedList test3 = new MyLinkedList();
    test3.extend(test);
    System.out.println(test);
    System.out.println(test.size());
    System.out.println(test3);
    System.out.println(test3.size());

    // // System.out.println(test.get(0));
    // // System.out.println(test.get(5));
    // // System.out.println(test.get(3));
    //
    // test.set(0, "sssero");
    // test.set(5, "fiiiiive");
    // test.set(3, "tree");
    // System.out.println(test);
    // System.out.println(test.toStringReversed());

    // test.remove(3);
    // test.remove(0);
    // test.remove(3);
    // test.remove(0); test.remove(0); test.remove(0);
    // test.remove(0); test.remove(0);
    // System.out.println(test);
    // System.out.println(test.size());
    // test.remove(0);
    // System.out.println(test);
    // System.out.println(test.size());

    // ////// MR. K'S Tester
    //
    // MyLinkedList words = new MyLinkedList();
    //
    // //add 0-9 in order
    // for(int i = 0; i < 10; i++){
    //   words.add(i+"");
    // }
    // //insert 0x - 9x before each value 0-9
    // for(int i = 0; i < 10; i++){
    //   words.add(2*i,i+"x");
    // }
    // //check the head/tail add
    // words.add(0,"head");
    // words.add(words.size(),"tail");
    //
    // try{
    //   words.add(-1,"");
    //   System.out.println("ERROR! Added to negative index");
    // }catch(IndexOutOfBoundsException e){
    //
    // }
    //
    // try{
    //   words.add(words.size()+1,"");
    //   System.out.println("ERROR! Added to (size + 1) index");
    // }catch(IndexOutOfBoundsException e){
    //
    // }
    //
    //
    // System.out.println("Your result:\n"+words+" "+words.size());
    // System.out.println("expected:\n[head, 0x, 0, 1x, 1, 2x, 2, 3x, 3, 4x, 4, 5x, 5, 6x, 6, 7x, 7, 8x, 8, 9x, 9, tail] 22");
    // System.out.println("\nYour result:\n"+words.toStringReversed()+" "+words.size());
    // System.out.println("expected:\n[tail, 9, 9x, 8, 8x, 7, 7x, 6, 6x, 5, 5x, 4, 4x, 3, 3x, 2, 2x, 1, 1x, 0, 0x, head] 22");
    // /////////
  }
}
