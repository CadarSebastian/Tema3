
public class Patrat {

	public static void main(String[] args) {
		Patrat p1= new Patrat();
		Patrat p2= new Patrat(4);
		Patrat p3= new Patrat(10);
		p1.potrivita();
		p2.potrivita();
		p3.potrivita();
		

	}

	int l;

	public Patrat() {
		this.l = 10;

	}

	public Patrat(int l) {
		this.l = l;

	}

	public void potrivita() {
		int a = this.l * 2;
		System.out.println("partat " + this.l + " Aria " + a);
	}

	

}
