package CORE_JAVA;

public class calculator {
    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4));
        System.out.println(subtract(10, 4, 2, 3));
        System.out.println(multiply(5, 6  , 6));;
        System.out.println(divide(10, 5));;
        
    }

    public static int add(int a,int b, int c ,int d){
        return a+b+c+d;
        
       }

       public static int subtract(int a,int b, int c ,int d){
        return a-b-c-d;
      
       }

       public static int multiply(int a,int b, int c ){
        return a*b*c;
        
       }

       public static int divide(int a,int b){
        return a/b;
      
       }
 



}




