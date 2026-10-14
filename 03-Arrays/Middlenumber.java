// middle number of array

import java.util.*;
class Middlenumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n%2!=0){
            System.out.print(arr[n/2]);
        }else{
            System.out.print((arr[(n/2)-1])+","+(arr[n/2]));
        }
    }
}