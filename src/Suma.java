
public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s= new Suma();
		
		System.out.println(s.suma(2, 6, 9, 5));
	}
	public static int suma(int a, int b) {
		 return a+b;
		 
	}
	public static int suma(int a, int b, int c) {
		return suma(a,b)+c;
	}
	public static int suma(int a, int b, int c ,int d) {
		return suma(a,b,c)+d;
	}

}
