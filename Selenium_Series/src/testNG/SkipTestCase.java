package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("start the car");
	}
	@Test(priority=1)
	public void putfirstGear() {
		System.out.println("firstGearr");
	}
	@Test(priority=5,enabled=false)
	public void turntheMusison() {
		System.out.println("Music turned ON");
	}
	@Test(priority=2)
	public void putsecondGear() {
		System.out.println("secondGear");
	}
	@Test(priority=3)
	public void putthirdGear() {
		System.out.println("thirdGear");
	}
	@Test(priority=4)
	public void putfourthGear() {
		System.out.println("fourthGear");
	}

}
