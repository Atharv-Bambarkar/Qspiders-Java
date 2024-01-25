import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        //grade(59);
        //typeOfData('P');
        // switchCase(5);
        switchCase2("add");

        

    }

    static void divisibleBy3And7(int num) {
        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("Divisible by 3 & 7");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (num % 7 == 0) {
            System.out.println("Divisible by 7");
        } else {
            System.out.println("Not Divisible by 3 & 7");
        }

    }

    static void isVowelOrConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }


    static void grade(int marks) {
        if (marks <= 34) {
            System.out.println("F");
        } else if (marks >= 35 && marks <= 49) {
            System.out.println("D");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("B+");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("A");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A+");
        } else {
            System.out.println("Invalid marks");
        }
    }



    static void typeOfData(char ch){
        if (ch>='A' && ch<='Z'){
            if (ch == 'A' || ch == 'E' || ch == 'I'
            || ch == 'O' || ch == 'U') {
        System.out.println("Upper Vowel");
    } else {
        System.out.println("Upper Consonant");
    }

        }

        else if (ch>='a' && ch<='z'){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println("Lower Vowel");
        } else {
            System.out.println("Upper Consonant");
        }
        }

        else if (ch>='0' && ch<='9'){
            System.out.println("number");
        }

        else {
            System.out.println("special char");
        }

    }

    static void switchCase(int ch){
        switch (ch){
            case 1: System.out.println("Monday");
            break; // control transfer to next case
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Invalid day");
            break;
            
        }
    }


    static void switchCase2(String ch){

        Scanner sc =new Scanner(System.in);
        
        switch (ch){
            case "add": 
            System.out.println("Value of a ");
            int a = sc.nextInt();
            System.out.println("Value of b ");
            int b = sc.nextInt();
            System.out.println("value is " + (a+b));
            break;

            case "subtract":
            System.out.println("Value of a ");
            int a1 = sc.nextInt();
            System.out.println("Value of b ");
            int b1 = sc.nextInt();
            System.out.println("value is " + (a1-b1));
            break;

            case "multiply":
            System.out.println("Value of a ");
            int a2 = sc.nextInt();
            System.out.println("Value of b ");
            int b2 = sc.nextInt();
            System.out.println("value is " +  (a2*b2));
            break;

            case "divide":
            System.out.println("Value of a ");
            int a3 = sc.nextInt();
            System.out.println("Value of b ");
            int b3 = sc.nextInt();
            System.out.println(" value is "+(a3/b3));
            break;

            case "default":
            System.out.println("Invalid operation");


        }

        sc.close();
        
    }






}
