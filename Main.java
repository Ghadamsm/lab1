import java.util.Scanner;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        

//  1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input .



//        System.out.println("please enter a 1st number :");
//        int first = s.nextInt();
//
//        System.out.println("please enter a 2nd number :");
//        int second = s.nextInt();
//
//
//        int sum = first + second ;
//        int mul = first - second ;
//        int sub = first * second ;
//        int div = first / second ;
//        int rem = first % second ;
//
//
//        System.out.println(first + " + " + second + " = " + sum);
//        System.out.println(first + " - " + second + " = " + mul);
//        System.out.println(first + " * " + second + " = " + sub);
//        System.out.println(first + " / " + second + " = " + div);
//        System.out.println(first + " % " + second + " mod " + rem);






//  2.Write a Java program that takes a number as input and prints its multiplication table up to 10.



//        System.out.println("Enter a number :");
//        int num = s.nextInt();
//
//        for (int i = 1; i <= 10 ; i++) {
//
//            int sub = num * i ;
//            System.out.println(num + " * " + i + " = " + sub);
//
//        }






//  3. Write a Java program to print the area and perimeter of a circle.



//        System.out.println(" please enter a Radius : ");
//        double radius = s.nextDouble();
//
//
//        double area = Math.PI * radius * radius ;
//        double perimeter = 2 * Math.PI * radius ;
//
//        System.out.println("Perimeter is = " + perimeter);
//        System.out.println("Area is = " + area);







//  4.Java program to find out the average of a set of integers.



//        System.out.println("Enter the count of numbers : ");
//        int number ;
//        number = s.nextInt();
//        double num1 = 0 ;
//        double av = 0;
//        int i ;
//
//        while (number != -1){
//
//            for (i = 0; i <= number ; i++) {
//
//                num1 = number + number ;
//
//                System.out.println("Enter a integer : ");
//                number = s.nextInt();
//            }
//
//            av = num1 / i  ;
//        }
//
//
//        System.out.println("The average is : " + av );






//  5.Write a Java program that accepts three integers as input, adds the first two integers
//together, and then determines whether the sum is equal to the third integer.



//        System.out.println("Input the first number : " );
//        int first = s.nextInt();
//
//
//        System.out.println("Input the second number : ");
//        int second = s.nextInt();
//
//
//        System.out.println("Input the third number : ");
//        int third = s.nextInt();
//
//        int sum = first + second ;
//
//
//
//
//        if (sum == third){
//
//            System.out.println("The result is : true");
//
//        } else {
//            System.out.println("The result is : false");
//        }






//  6.Write a Java program to reverse a word.



//        String rev = "";
//
//        System.out.println("input a word : ");
//        String word = s.next();
//        int length = word.length();
//
//        for (int i =  length -1 ; i >= 0 ; i--) {
//            rev = rev + word.charAt(i);
//        }
//        System.out.print( rev );







//  7.Java program to check whether the given number is even or odd.




//        System.out.println("Enter a number : ");
//        int number = s.nextInt() ;
//
//
//        if (number%2 == 0){
//            System.out.println("The number is Even");
//
//        } else {
//            System.out.println("The number is Odd");
//
//        }
//






//  8.Java program to convert the temperature in Centigrade to Fahrenheit.



//        System.out.println("Enter temperature in Centigrade : ");
//        double centigrade = s.nextDouble();
//
//        double fahrenheit = (centigrade * 1.8) + 32 ;
//
//        System.out.println("Temperature in Fahrenheit is : " + fahrenheit);







//  9.Write a Java program that takes a string and a number from the user,then prints the
//character in the given index.



//        System.out.println("Input a string : ");
//        String string = s.nextLine();
//
//
//        System.out.println("Input a number : ");
//        int number = s.nextInt();
//
//
//        System.out.println("Expected Output : " + string.charAt(number));








//  10.Write a Java program to print the area and perimeter of a rectangle.



//        System.out.println("Width = ");
//        double width = s.nextDouble();
//
//
//        System.out.println("Height = ");
//        double height = s.nextDouble();
//
//
//
//        double area = width * height ;
//        double perimeter = 2 * (width + height) ;
//
//
//        System.out.println("Area is " + width + " * " + height + " = " + area);
//        System.out.println("Perimeter is 2* ( " + width + " + " + height + " ) = " + perimeter);








//  11.Write a Java program to compare two numbers.



//        System.out.println("Input first integer : ");
//        int first = s.nextInt();
//
//
//        System.out.println("Input second integer : ");
//        int second = s.nextInt();
//
//
//
//        if (first > second){
//            if (first >= second){
//
//                System.out.println(first + " != " + second);
//                System.out.println(first + " >= " + second);
//
//            }
//            System.out.println(first + " > " + second);
//
//        }
//        else if (first < second) {
//             if (first <= second){
//
//                 System.out.println(first + " != " + second);
//                 System.out.println(first + " <= " + second);
//
//            }
//            System.out.println(first + " < " + second);
//
//        } else if (first == second) {
//            System.out.println(first + " == " + second);
//        }






//  12.Write a Java program to convert seconds to hours, minutes and seconds.



//        System.out.println("Input seconds : ");
//
//        int second = s.nextInt();
//
//
//        int hour = second / 3600 ;
//        int min = ( second % 3600 ) / 60  ;
//        int sec = ( second % 3600 ) % 60;
//
//        System.out.println(hour + " : " + min + " : " + sec);










//  13.Write a Java program that accepts four integers from the user and prints equal if all
//four are equal, and not equal otherwise.




//        System.out.println("Input first number : ");
//        int first = s.nextInt();
//
//
//        System.out.println("Input second number : ");
//        int second = s.nextInt();
//
//
//        System.out.println("Input third number : ");
//        int third = s.nextInt();
//
//
//        System.out.println("Input fourth number : ");
//        int fourth = s.nextInt();
//
//
//        if ((first == second) && (third == fourth)) {
//
//            System.out.println("Numbers are equal ");
//        }else {
//            System.out.println("Numbers are not equal !");
//        }







//  14.Write a Java program that reads an integer and check whether it is negative, zero, or positive.




//
//        System.out.println("input a number : ");
//        int number = s.nextInt();
//
//        if (number >= 1){
//            System.out.println("Number is positive");
//
//        } else if (number == 0) {
//            System.out.println("Number is Zero");
//
//        }else {
//            System.out.println("Number is negative");
//
//        }






//  15.Write a program to enter the numbers till the user wants and at the end it should
//display the count of positive, negative and zeros entered




//        System.out.println("enter a number or -1 to quit");
//        int num = s.nextInt();
//
//        int positive = 0, negative = 0, zero = 0;
//
//        while (num != -1) {
//            System.out.println("enter a number");
//            num = s.nextInt();
//
//            if (num > 0) {
//                positive++;
//            } else if (num < 0) {
//                negative++;
//            } else {
//                zero++;
//            }
//
//        }
//
//        System.out.println(positive + " positives ");
//        System.out.println(negative + " negatives ");
//        System.out.println(zero + " Zero ");








//  16.Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed



//        System.out.println("enter a number ");
//        int num = s.nextInt();
//
//        String rev = "";
//
//        System.out.println("enter a number ");
//        int num = s.next();
//        int length = num;
//
//        for (int i =  length -1 ; i >= 0 ; i--) {
//            rev = rev + num.;
//        }
//        System.out.print( rev );







//  17.Write a program to enter the numbers till the user wants and at the end the program
//should display the largest and smallest numbers entered.




//        System.out.println("enter the number or 0 to quit : ");
//        int num = s.nextInt();
//
//        int large = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
//
//        while (num != 0){
//
//            System.out.println("enter the number : ");
//            num = s.nextInt();
//
//             if (num > large){
//                 large = num ;
//
//             }if (num < small ) {
//                 small = num;
//            }
//
//
//        }
//        System.out.println("the large number : " + large);
//        System.out.println("the small number : " + small);







//  18.Determine and print the number of times the character ‘a’ appears in the input entered by the user.


//        System.out.println("enter String : ");
//        String string = s.nextLine();
//
//        char ch = 'a';
//        int count = 0 ;
//
//
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i)== ch ){
//                count++;
//            }
//
//        }
//
//        System.out.println("numbers of a's : " + count);


    }

}