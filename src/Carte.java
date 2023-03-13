 public class Carte {
	private int nr;

	public Carte(int nr) {
		this.nr = nr;
	}

	public static void main(String[] args) {
		Carte c1 = new Carte(50);
		Carte c2 = new Carte(50);

		if (c1.potrivita(c2))
			System.out.println("este aceeasi");
		else
			System.out.println("nu este aceeasi");

	}

	public boolean potrivita(Carte nr2) {
		return this.nr == nr2.nr;
	}
}
