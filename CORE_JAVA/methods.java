package CORE_JAVA;

public class methods {
    public static void main(String[] args) {
    //    System.out.println(add()); 
    //    System.out.println(multiply()); 
    //    System.out.println(addString("Atharv","Bambarkar")); 
        test();
        test("sanket");
        test(10);
        test(12.f);
        test(false);
        test(12);
        test('a');
    }

    // public static int add(){
    //     int sum =0;
    //     for (int i = 1; i <= 10; i++) {
    //         sum+=i;
    //     }
    //     return sum;
    // }

    // public static int multiply(){
    //     int j=1;
    //     for (int i = 5; i > 0; i--) {
    //          j *=i;
    //     }
    //     return j;
    // }

    // public static String addString(String a,String b){
    //     String c= a+" "+b;
    //     return c;
        
    // }




    public static void test(){
        System.out.println("no aduments");
    }

    public static void test(double a){
        System.out.println("double aduments");
    }

    public static void test(boolean a){
        System.out.println("bool aduments");
    }

    public static void test(float a){
        System.out.println("float aduments");
    }

    public static void test(int a){
        System.out.println("int aduments");
    }

    public static void test(String a){
        System.out.println("String aduments");
    }
}
