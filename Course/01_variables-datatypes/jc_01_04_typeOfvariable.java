
public class jc_01_04_typeOfvariable {
  public static String typeOf(Object x) {
    String str = x.getClass().getSimpleName();
    return str;
  }

  public static void main(String[] args) {
    long b = 123L;
    System.out.println(typeOf((Object) b));
    ;
  }
}
