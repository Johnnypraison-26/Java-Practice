import java.util.Scanner;
class butterfly{
    public static void main(String[]args){
        System.out.println("enter no of rows : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int r=1;r<=a;r++){
            for(int c=1;c<=a;c++){
                if(c==1 || r==c || c==a || r+c==a+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}