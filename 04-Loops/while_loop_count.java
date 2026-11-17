import java.util.Scanner;
class while_loop_count{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to count : ");
        int a= 1;
        int b=sc.nextInt();
        while(a<=b){
            System.out.println(a);
            a=a+1;
        }
        System.out.println("Number exceeds");
    }
}