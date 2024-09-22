
package com.softwareengineering.course;
import static org.junit.Assert.*;
import java.lang.Math;
import org.junit.Before;
import org.junit.Test;


public class HybridTests {

	Hybrid hybrid;

	@Before
	public void setUp() throws Exception {
		hybrid  = new Hybrid();
    }

	@Test
	public void GasMPG() {

		Hybrid car = new Hybrid();
        car.setMilesfromGas(50.0);
        car.setGallonsfromGas(2.0);
		double expected = 25.0;
		double actual = car.calcGasMPG();

		assertTrue(actual == expected);
	}

	@Test
	public void MPGe() {

		Hybrid car = new Hybrid();
        car.setElectricMiles(30.0);;
        car.setTotalkWh(30.0);;
		double expected = 33.7;
		double actual = car.calcMPGe();

		assertTrue(actual == expected);
	}

	@Test
	public void CostperGallon() {

		Hybrid car = new Hybrid();
        car.setCostPerGallon(5);
		double expected = 5.0;
		double actual = car.getCostPerGallon();

		assertTrue(actual == expected);
	}

	@Test
	public void CostperKWh() {

		Hybrid car = new Hybrid();
        car.setCostPerkWh(5);
		double expected = 5.0;
		double actual = car.getCostPerkWh();

		assertTrue(actual == expected);
	}

}
