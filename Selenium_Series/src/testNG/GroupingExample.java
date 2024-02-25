package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	/*Scenario: a big bracket is having a different kind of mobiles.
	let us say there are apple phones,Moto, Vivo and Lenovo.
	I want to run test only for Vivo and Moto phones.
	write a program for that*/
	
	@Test (groups = "Apple")
	public void Apple1() {
		System.out.println("Apple testing");
	}
	@Test (groups = "Apple")
	public void Apple2() {
		System.out.println("Apple testing");
	}
	@Test (groups = "Vivo")
	public void Vivo1() {
		System.out.println("Vivo testing");
	}
	@Test (groups = "Vivo")
	public void Vivo2() {
		System.out.println("Vivo testing");
	}
	@Test (groups = "Moto")
	public void Moto1() {
		System.out.println("Moto testing");
	}
	@Test (groups = "Moto")
	public void Moto2() {
		System.out.println("Moto testing");
	}
	@Test (groups = "Lenovo")
	public void Lenovo1() {
		System.out.println("Lenovo testing");
	}
	@Test (groups = "Lenovo")
	public void Lenovo2() {
		System.out.println("Lenovo testing");
	}

}
