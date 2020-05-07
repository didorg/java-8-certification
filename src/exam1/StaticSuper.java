package exam1;

class StaticSuper {
  static {
    System.out.println ("super static block");
  }
  StaticSuper() {
    System.out.println ("super constructor");
  }
}

class StaticFirst extends StaticSuper {
  public static void main(String[] args) {
    StaticFirst sf = new StaticFirst();
  }
}
/** What is the result?
 A) super constructor
 B) super static block
 C) super static block
    super constructor
 D) super constructor
    super static block
 * **/
