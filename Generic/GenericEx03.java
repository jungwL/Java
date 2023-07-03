package javapro.Generic;

public class GenericEx03 {

	public static void main(String[] args) {
		HomeAgency myHA=new HomeAgency();
		Home myHome=myHA.rent();
		myHome.turnOnLight();
		
		SCarAgency mySCA=new SCarAgency();
		SCar myScar=mySCA.rent();
		myScar.run();

	}

}
