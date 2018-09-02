import java.lang.*;
import java.util.Random;

public class randomSentGen {



   public static void myFunction(String[] x){
        double xLength = x.length;

        String xOutput = "I'm the scat man ";

        for(int i = 0; i < 100; i++){
            if (i%5 == 0){
                xOutput += ", ";
            }
            else {
                int rnd = new Random().nextInt(x.length);
                xOutput += x[rnd];
            }
        }

        System.out.println("OUTPUT:  " + xOutput);
    }
    public static void main (String args[]){

        //This program likes scat jazz
        String[] sentExample = {"ski ", "ba ", "bo ", "di ", "bada ", "boop ", "whoop ","sk ", "tsk "};
        myFunction(sentExample);
    }
}
