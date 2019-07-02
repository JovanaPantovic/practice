package planinarenje;

public class KlasicniPlaninar extends Planinar {

	public KlasicniPlaninar (String ime, String prezime) {
		super(ime, prezime);
	}
	
	private Planina planina;
	
	@Override
	public boolean penjanje() {
		if (planina.getVisina() < 2000)	return true;
		else return false;
	}
	
	public void opis () {
		System.out.println("K_" + this.toString());	
	}
	

}
