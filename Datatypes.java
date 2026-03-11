class Datatypes{
public static void main(String[] args){
byte a = 12;
short b = 12;
int c = 14;
long d = 23;
float e = 12.234f;
double f = 24.789d;
boolean g = true;
boolean h = false;
char i = 'a';
System.out.println(a); //byte 
//RANGE: -128 to 127

System.out.println(b); //short
// RANGE: -32,768 to 32,767

System.out.println(c); //int
// RANGE: -2147483648 to 2147483647
// 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1

System.out.println(d); //long
// RANGE: -2^63 to -2^63-1
// 64-bit two's complement integer. The signed long has a minimum value of -2^63 and a maximum value of 2^63-1

System.out.println(e); //float
//  32-bit IEEE 754 floating point

System.out.println(f); //double
// 64-bit IEEE 754 floating point

System.out.println(g); //boolean
System.out.println(h); //boolean
// The boolean data type has only two possible values: true and false.

System.out.println(i); //char
// The char data type is a single 16-bit Unicode character.
// It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

// Primitive Datatypes of Java: 8 Data Types.

}
}

//Source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html --> Oracle Website.

// Refer more for the Default values and Hierarchical Order of Datatypes in Java from above.