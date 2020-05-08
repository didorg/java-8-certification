package exam1;

public class SuperClass {
  SuperClass(int x) {
    System.out.println("Super");
  }
}
 class SubClass extends SuperClass {
  SubClass() {
    // Line n1
    System.out.println("Sub 2");
  }
}
/** Which statement, when inserted at Line n1, enables the code to compile?
 A) this(10);
 B) super(10);
 C) SuperClass(10);
 D) super.SuperClass (10);
 * **/
