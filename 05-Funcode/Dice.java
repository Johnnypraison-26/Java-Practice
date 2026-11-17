import java.util.Random;
class Dice{
    public static void main(String [] args){
        Random dice = new Random();
        int a=dice.nextInt(6)+1; //6 ranges from 0-5 and +1 changes the sequence t0 1-6 that is 0+1-5+1
        System.out.print(a);
    }
}