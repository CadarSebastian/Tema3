
public class Piramida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piramida p1= new Piramida(4);
		p1.potrivita();
	}
	int n;
	public Piramida(int n) {
		this.n=n;
	}
	public  void potrivita() {
		
		int j=n;
		for (int i=1;i<=n;i++) {
			for( int o=j;o>=1;o--) {
				System.out.print(i+" ");
				if(i==n) {
					System.out.print("--> n");
				}
				
			}
				j--;
				System.out.println();
		} 
	}

}
