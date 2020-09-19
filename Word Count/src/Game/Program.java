package Game;

public class Program {



    public static void main(String[] args) {

             Program.countWords("Is this easy mode");
             Program.countWords("What an easy task, right");
             Program.countWords("Just an example here move along");
             Program.countWords("This is a test");
    }

    public  static int countWords(String text) {

        int i=0;

        for (String partText: text.split(" ") ) {
            i++;


        }

        System.out.println(i);
        return i;
    }
}
