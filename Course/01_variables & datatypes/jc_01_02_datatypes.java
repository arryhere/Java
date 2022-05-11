/*
• Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double
• Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays

• Primitive Data Types - 

    Data Type	Default Value	Default size
    boolean	    false	        1 bit
    char	    '\u0000'	    2 byte
    byte	    0	            1 byte
    short	    0	            2 byte
    int	        0	            4 byte
    long	    0L	            8 byte
    float	    0.0f	        4 byte
    double	    0.0d	        8 byte

*/

// package com.company;

public class jc_01_02_datatypes {
    public static void datatypes(){
        Boolean b = false;

        char c = 'a';
        
        byte by = 28;               // -128 to 127

        short s = -5;               // -32,768 to 32,767

        int i = 19;                 // - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)

        long l = 99L;               // -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)

        float f = 12.44F;           // value range is unlimited

        double d = 12.34;           // value range is unlimited

    }
    public static void main(String[] args) {
        datatypes();
    }
}
