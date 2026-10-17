import java.util.*;
class Equals{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.equals("win")){
            System.out.println("won");
        }
        else if(s.equals("lose")){
            System.out.println("next time");
        }
        else{
            System.out.println("invalid");
    }
}
}