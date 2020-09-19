package Game;

import java.util.Scanner;

public class Start {
    String answer1, answer2;
    String result;
    Scanner scanner=new Scanner(System.in);



    public Start(){

        System.out.println("First player");
        answer1=scanner.next();

        System.out.println("Second  player");
        answer2=scanner.next();


        rps(answer1,answer2);
        System.out.println(result);
}

    private void rps(String answ1, String answ2) {

        if(answ1.equals(answ2)){
            result="REMIS";
        }else if(answ1.equals("Papier") && answ2.equals("Kamien")){
            result="Player 1 WON";
        }
        else if(answ1.equals("Kamien") && answ2.equals("Nozyce")){
            result="Player 1 WON";
        }
        else if(answ1.equals("Nozyce") && answ2.equals("Papier")){
            result="Player 1 WON";
        }

        else if(answ1.equals("Kamien") && answ2.equals("Papier")){
            result="Player 2 WON";
        }
        else if(answ1.equals("Nozyce") && answ2.equals("Kamien")){
            result="Player 2 WON";
        }
        else if(answ1.equals("Papier") && answ2.equals("Nozyce")){
            result="Player 2 WON";
        }else{
            result="Error";
        }
    }
}
