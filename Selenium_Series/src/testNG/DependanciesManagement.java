package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("high school");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("high secondary School");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("college");
	}
	/*@Test(enabled=false)
	public void highSchool() {
		System.out.println("high school");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("high secondary School");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("college");
	}
	*/
}
