import java.util.Random;
class keyboard_key_generator{
    public static void main(String [] args){
        Random dice = new Random();
        int a=dice.nextInt(6)+1; //6 ranges from 0-5 and +1 changes the sequence t0 1-6 that is 0+1-5+1
        char b = (char) ('A' + dice.nextInt(8));
        System.out.print(b);
        System.out.print(a);
    }
}
//add menu to select between 1) white keys , black keys , chord major/min 

// ths above code just does for white keys