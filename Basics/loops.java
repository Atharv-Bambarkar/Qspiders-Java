public class loops {
    public static void main(String[] args) {
        int a = 16;
        

        /**
         * ! used 
         */
        // while (a >=1511) {
        //     System.out.println(a);
        //     a--;
        // }
        // System.out.println("===========================================");
    //     System.out.println("=================================================================");
    //     for (int i = 50; i >=1 ; i--) {
    //         if (i%7==0) {
    //             System.out.println(i);
                
    //         }
    //     }
    // System.out.println("=================================================================");

    //   do {
    //     System.out.println(a);
    //     a++;
        
    //   } while (a<=25);
      
    //   System.out.println("===========================================");

        // if (a%2==0) {
        //     int b=75;
        //     do {
        //         System.out.println(b);
        //         b--;
        //     } while (b>=35);

        // } else {
        //     int c=49;
        //     while (c<=79) {
        //         System.out.println(c);
        //         c++;
                
        //     }
        //     System.out.println("odd");
        // }


    System.out.println("=================================================================");
    for (int i = 1; i <=15 ; i++) {
            if (i%5==0 && i%3==0) {
                System.out.println("FizzBuzz");
                
            }
            else if (i%5==0) {
                System.out.println("Buzz");
            }
            else if (i%3==0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    System.out.println("=================================================================");





     }
    
}
