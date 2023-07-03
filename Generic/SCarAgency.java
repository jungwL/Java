package javapro.Generic;

public class SCarAgency implements Rentable<SCar> {

	@Override
	public SCar rent() {
		return new SCar();
	}

}
