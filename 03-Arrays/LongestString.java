// length of longest string in a sentence
import java.util.Scanner;
class LongestString{
    public static void main(String[]A){
        Scanner sc = new Scanner(System.in);
        int c=0;
        System.out.println("Enter a sentence : ");
        String a = sc.nextLine();
        String arr[]=a.split(" ");
        for(int q=0;q<arr.length;q++){
            if(c<arr[q].length()){
                c=arr[q].length();
            }
        }
        System.out.println("Longest string is : " + arr[c]);
        System.out.println("Length of the longest string: " + c);
    }
}