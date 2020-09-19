package Game;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {






    public static int warOfNumbers(int[]numbers){

        System.out.println("Tell how many numbers u want?");
        Scanner scanner=new Scanner(System.in);
         int ammountofNumbers=scanner.nextInt();

         int sumEven=0;
         int sumOdd=0;
        //losujemy losowe numery
        numbers=new int[ammountofNumbers];

        for (int i = 0; i <numbers.length ; i++) {



            numbers[i]= (int) (Math.floor(Math.random()*100)+1);
        //    System.out.print(numbers[i]+" ");


        }

        System.out.println(Arrays.toString(numbers));


        System.out.println("There will be war of numbers.\n\n");


        //Sprawdzanie czy numer nie jest  parzysty


        for (int i = 0; i <numbers.length ; i++) {


            if(numbers[i]%2==0){
                sumEven = sumEven+ numbers[i];
            }else{
                sumOdd =sumOdd+ numbers[i];
            }

        }

        if(sumEven>sumOdd){
         sumEven=   sumEven-sumOdd;

            System.out.println(sumEven+"\n\nEven wins");
        }else if(sumEven<sumOdd){
            sumOdd=sumOdd-sumEven;
            System.out.println(sumOdd+"\n\nOdd wins");
        }else{
            System.out.println("TIE");
        }


        System.out.println();

        return 0;
    }
}
