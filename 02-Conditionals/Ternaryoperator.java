//Ternaryoperator
 import java.util.Scanner;
class Ternaryoperator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a=sc.nextInt();
        System.out.println("Enter number 2 : ");
        int b=sc.nextInt();
        System.out.print(a>b?"a is greater":"b is greater");
    }
}