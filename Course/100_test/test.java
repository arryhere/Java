public class test {

  public static void bitwiseOperators() {
    int x = 5; // 0101
    int y = 12; // 1100

    int bitwise_AND = x & y; // 0100, 4
    int bitwise_OR = x | y; // 1101, 13
    int bitwise_NOT = ~x; // 1010, 10
    int bitwise_XOR = x ^ y; // 1001, 9

    System.out.println("bitwise_AND" + bitwise_AND);
    System.out.println("bitwise_OR" + bitwise_OR);
    System.out.println("bitwise_NOT" + bitwise_NOT);
    System.out.println("bitwise_XOR" + bitwise_XOR);
  }

  public static void main(String[] args) {
    bitwiseOperators();
  }
}
