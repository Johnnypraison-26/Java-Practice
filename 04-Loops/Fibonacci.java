// Fibonacci series
public class Fibonacci{
	public static void main(String[] args) {
	    int k1=0;
	    int k2=1;
	    System.out.print(k1+" ");
		for(int j=0;j<10;j++){
		    System.out.print((k2)+" ");
		    k2=(k1+k2);
		    k1=k2-k1;
		}
	}
}