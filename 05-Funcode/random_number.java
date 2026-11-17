import java.util.Random;
class random_number{
    public static void main(String [] args){
        Random dice = new Random();
        int a=dice.nextInt(7); //7 = upto 6 that is n-1
        System.out.print(a);
    }
}