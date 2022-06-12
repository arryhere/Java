/*
• Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double
• Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays

• Primitive Data Types - 

    Data Type	Default Value	Default size    Description
    boolean	    false	        1 bit           Stores true or false values
    char	    '\u0000'	    2 byte          Stores a single character/letter or ASCII values
    byte	    0	            1 byte          Stores whole numbers from -128 to 127
    short	    0	            2 byte          Stores whole numbers from -32,768 to 32,767
    int	        0	            4 byte          Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long	    0L	            8 byte          Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float	    0.0f	        4 byte          Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double	    0.0d	        8 byte          Stores fractional numbers. Sufficient for storing 15 decimal digits

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
