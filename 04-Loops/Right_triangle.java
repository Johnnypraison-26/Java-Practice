//Right_triangle
import java.util.Scanner;
class Right_triangle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int Size = sc .nextInt();
        for(int i=1;i<=Size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}