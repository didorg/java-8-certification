package exam1;

import java.util.ArrayList;
import java.util.List;

public class ListGetInPosition {
  public static void main(String[] args) {
    List<Integer> elements = new ArrayList<>();
    elements.add(10);
    int firstElement = elements.get(1);
    System.out.println(firstElement);
  }
}
/** What is the result?
 A) null
 B) 10
 C) 0
 D) An IndexOutOfBoundsException is thrown at runtime.
 * **/
