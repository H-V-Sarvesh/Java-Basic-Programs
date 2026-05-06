// method Overloading
// order of parameters, number of parameters
// and type of parameters

import java.util.*;

class Mathutils{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(int a, double b){
        return a+b;
    }

    double add(double a, int b){
        return a+b;
    }
}

class Test_Mathutils{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Mathutils mathpayOBJ = new Mathutils();
       System.out.println(mathpayOBJ.add(2,3));
       System.out.println(mathpayOBJ.add(2,3,4));
       System.out.println(mathpayOBJ.add(2,3.5));
       System.out.println(mathpayOBJ.add(3.5,10));
    }
}
