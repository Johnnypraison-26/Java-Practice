// Datatype_guesser v1 (work on character , line String , float)
import java.util.*;
class Datatype_guesser{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            System.out.println("Data type of input : Integer");
        }
        else if(sc.hasNextDouble()){
            System.out.print("Data type of input : Decimal");
        }
        else if(sc.hasNextBoolean()){
            System.out.print("Data type of input : Boolean");
        }
        else if(sc.hasNext()){
            System.out.print("Data type of input : String");
        }
    }
}