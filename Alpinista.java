package planinarenje;

public class Alpinista extends Planinar {
	

	public Alpinista (String ime, String prezime) {
		super(ime, prezime);
	}
	
	private Planina planina;
	private Alpinista alpinista;
	
	public void setPlaninar (Alpinista alpinista) {
		this.alpinista = alpinista;
		alpinista.alpinista=this;
	}
	
	public Planinar getAlpinista () {
		return alpinista;
	}
	
	@Override
	public boolean penjanje() {
		if (this.alpinista == null && planina.getVisina() < 3000) return false;
		else return true;
	}
	
	public void opis () {
		System.out.println("A_" + this.toString());	
	}

}
