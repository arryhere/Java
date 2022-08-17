/*
• Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double
• Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays

• Primitive Data Types -

  Data Type	  Default Value   Default size      Description
  boolean	    false	          1 bit             Stores true or false values
  char	      '\u0000'	      2 byte            Stores a single character/letter or ASCII values
  byte	      0	              1 byte            Stores whole numbers from -128 to 127
  short	      0	              2 byte            Stores whole numbers from -32,768 to 32,767
  int	        0	              4 byte            Stores whole numbers from -2,147,483,648 to 2,147,483,647
  long	      0L	            8 byte            Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
  float	      0.0f	          4 byte            Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
  double	    0.0d	          8 byte            Stores fractional numbers. Sufficient for storing 15 decimal digits

• Primitive Data Types / Reference Types -
  Non-primitive types are created by the programmer and is not defined by Java (except for String)
  The non-primitive data types include Classes, Interfaces, and Arrays
*/

public class jc_01_02_datatypes {
  public static void primitiveDatatypes() {
    boolean _boolean = false;

    char _char = 'a';

    byte _byte = 28; // -128 to 127

    short _short = -5; // -32,768 to 32,767

    int _int = 19; // - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)

    long _long = 99; // -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)

    float _float = 12.44F; // value range is unlimited

    double _double = 12.34; // value range is unlimited

    System.out.println("boolean" + " " + _boolean);
    System.out.println("char" + " " + _char);
    System.out.println("byte" + " " + _byte);
    System.out.println("short" + " " + _short);
    System.out.println("int" + " " + _int);
    System.out.println("long" + " " + _long);
    System.out.println("float" + " " + _float);
    System.out.println("double" + " " + _double);
  }

  public static void referenceDatatypes() {
    String _String = "Arijit Das";

    System.out.println("String" + " " + _String);
  }

  public static void main(String[] args) {
    primitiveDatatypes();
    referenceDatatypes();
  }
}
